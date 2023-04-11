
/*
 
 리플랙션
 	- 자바의 클래스나 인터페이스(추상클래스)의 메타정보(패키지, 멤버, 타입 정보 등)를 프로그램을 통해 읽고 수정하는 행위
 	
 	- 클래스 정보 얻기
 		- Class myClass = 클래스명.class;								: 클래스 자체에서 얻기
 		- Class myClass = Class.forName("패키지.패키지...클래스명");		: 클래스 자체에서 얻기
 		
 		- Class myClass = 클래스참조객체.getClass();						: 클래스를 참조하는 객체로부터 얻기
 		
 
 	- 패키지 및 타입 정보 얻기
 		- 클래스정보.getPackage();			: 패키지 정보 읽기
 		- 클래스정보.getSimpleName();		: 패키지 제외한 타입 이름
 		- 클래스정보.getName();				: 패키지 포함 전체 타입 이름
 
 
  	- 맴버(생성자, 필드, 메소드) 정보 얻기 
 		- 클래스정보.getDeclaredConstructors()		: 생성자 정보 읽기 (Constructor[] 타입)
 		- 클래스정보.getDeclaredFields()			: 필드 정보 읽기 (Field[] 타입)
 		- 클래스정보.getDeclaredMethods()			: 메소드 정보 읽기 (Method[] 타입)
 */




package ch12.sec11.exam01;

public class GetClassExample {

	public static void main(String[] args) throws Exception {
		
		//클래스 정보를 얻는 세 가지 방식
		Class myCarClass1 = Car.class;
		
		Class myCarClass2 = Class.forName("ch06.sec09.Car");
		
		Car myCar = new Car();
		Class myCarClass3 = myCar.getClass();
		
		
		
		//클래스 정보를 통해 패키지와 타입 정보 읽기
		
		//타입 + 전체 이름
		System.out.println(myCarClass1);
		System.out.println();
		
		//타입 + 패키지만
		System.out.println(myCarClass1.getPackage());
		System.out.println();
		
		//전체 이름
		System.out.println(myCarClass1.getName());
		System.out.println();
		
		//간단 이름 (클래스 이름만)
		System.out.println(myCarClass1.getSimpleName());
		System.out.println();
		
		//패키지만
		System.out.println(myCarClass1.getPackageName());
		System.out.println();
		//패키지만
		System.out.println(myCarClass1.getPackage().getName());
		System.out.println();
		
		

	}

}
