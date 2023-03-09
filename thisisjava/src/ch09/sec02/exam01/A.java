package ch09.sec02.exam01;

public class A {
	
	
	//충첩클래스 B
	class B {
		//생성자
		public B() {
			
		}
		
		void methodB() {
			System.out.println("중첩 클래스 B 객체의 메소드 실행");
		}
		
	}
	
	//클래스A 필드 선언, 중첩클래스 타입 변수에 B객체 대입 가능
	B field = new B();
	
	//A 생성자 안에 중첩 클래스 B로 B객체 생성 가능
	A(){
		B b = new B();
	}
	
	//메소드 선언, 메소드 안에 중첩 클래스 B의 지역변수 선언하여 B객체 대입 가능
	void methodA() {
		B b = new B();
		System.out.println("A객체의 메소드 실행");
	}

}
