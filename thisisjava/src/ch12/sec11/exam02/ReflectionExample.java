
/*
 
 리플랙션
 	- 자바의 클래스나 인터페이스(추상클래스)의 메타정보(패키지, 멤버, 타입 정보 등)를 프로그램을 통해 읽고 수정하는 행위
 	
 	- 클래스 정보 얻기
 		- Class myClass = 클래스명.class;								: 클래스 자체에서 얻기
 		- Class myClass = Class.forName("패키지.패키지...클래스명");		: 클래스 자체에서 얻기
 		
 		- Class myClass = 클래스참조객체.getClass();						: 클래스를 참조하는 객체로부터 얻기
 		
 
 	- 패키지 및 타입 정보 얻기
 		- 클래스정보.getPackage();			: 패키지 정보 읽기 (Package 타입)
 		- 클래스정보.getSimpleName();		: 패키지 제외한 타입 이름 (String 타입)
 		- 클래스정보.getName();				: 패키지 포함 전체 타입 이름 (String 타입)
 		
 	
 	- 맴버(생성자, 필드, 메소드) 정보 얻기 (import java.lang.reflect.*)
 		- 클래스정보.getDeclaredConstructors()		: 생성자 정보 읽기 (Constructor[] 타입) (.getParameterTypes()으로 매개변수 받고 printParameters()로 출력)
 		- 클래스정보.getDeclaredFields()			: 필드 정보 읽기 (Field[] 타입) 
 		- 클래스정보.getDeclaredMethods()			: 메소드 정보 읽기 (Method[] 타입) (.getParameterTypes()으로 매개변수 받고 printParameters()로 출력)
 		
 			*Declared는 '선언된' 이라는 뜻인데 사용자 선언 말고 자동 선언된 생성자도 포함임
 
 */


//클래스의 생성자, 필드, 메소드 정보 얻어서 출력하기 (매개변수 포함)
package ch12.sec11.exam02;

import java.lang.reflect.*;

public class ReflectionExample {
	
	private static void printParameters(Class[] parameters) {
		for(int i=0; i<parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if(i<(parameters.length-1)) {
				System.out.print(",");
			}
		}
	}

	public static void main(String[] args) throws Exception{
		
		Class myClass = Car.class;
		
		System.out.println("[생성자 정보]");
		Constructor[] constructors = myClass.getDeclaredConstructors();
		
		for(Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		System.out.println();
		
		
		System.out.println("[필드 정보]");
		Field[] fields = myClass.getDeclaredFields();
		for(Field field : fields ) {
			System.out.println(field.getType().getName() + " " + field.getName());
		}
		System.out.println();
		
		System.out.println("[메소드 정보]");
		Method[] methods = myClass.getDeclaredMethods();
		for(Method method : methods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}

	}

}
