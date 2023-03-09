package ch09.sec04.exam01;

public class A {
	
	//A 생성자 선언
	A(){
		//생성자 안에 로컬 클래스 B
		class B{	
		}
		
		//로컬 객체 생성
		B b = new B();
	}
	
	
	//메소드 선언
	void method() {
		
		//메소드 안에서 로컬 클래스 B
		class B {
		}
		
		//로컬 객체 생성
		B b = new B();
	}

}
