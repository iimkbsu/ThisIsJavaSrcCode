
/*
 
 포장 클래스(Wrapper class)
 	-  컬랙션 객체 때문에 래퍼 클래스 사용함 (기본 타입의 값은 저장이 안 되는데, 객체는 저장이 가능해서)
 
 
 자동 Boxing 과 UnBoxing
 	- 포장 클래스 타입으로 값을 저장할 때 Boxing이 발생해 포장 객체가 된다.
 	- 포장 객체에서 기본 타입으로 값을 저장할 때 UnBoxing이 발생하여 기본 타입 변수에 저장됨.
 
 
 
 
 기본타입				포장 클래스
 
 int				Integer
 char				Character
 
 short				Short
 byte				Byte
 long				Long
 float				Float
 double				Double
 boolean			Boolean
 
 */


package ch12.sec06;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		
		//기본 타입에 값 대입
		int a = 100;
		
		//래퍼 클래스에 값 대입하여 객체생성(자동 Boxing)
		Integer obj = 100;
		
		
		
		//자동 boxing 없이 new 연산으로 객체 생성도 가능 (귀찮음)
		Integer intObj = new Integer(200);
		System.out.println(intObj);
		System.out.println();
		
		
		
		//기본 타입에 래퍼 클래스로 만든 Integer 타입 객체 대입(자동 UnBoxing)
		int b = obj;
		
		//정석적인 표현
		int c = obj.intValue();
		
		
		
		//자동 UnBoxing 후에 int타입으로 연산
		int sum = obj + obj;
		
		
		
		//서로 다 같은 int형 100이 출력됨 (자동 boxing unboxing 되었기 때문)
		System.out.println("int a : " + a);
		System.out.println("Integer obj : " + obj);
		System.out.println("Integer obj.intValue() : " + obj.intValue()); //Integer 객체 내부의 int값을 리턴
		System.out.println("int b : " + b);
		
		
		

	}

}




