package ch09.sec03.exam01;

public class A {
	
	
	//public static - 다른 패키지에서 A객체 없이 B 사용 가능
	//[default] static - 같은 패키지에서 A객체 없이 B 사용 가능
	//private static - A클래스 내부에서만 B 사용 가능
	
	
	//정적 클래스 B 생성 (접근제한자 default = 같은 패기지에서만 사용가능)
	//A 객체생성 없이 B 클래스 사용 가능 (정적 멤버)
	static class B {
		//B생성자 선언
		B(){
		}
	}
	
	//인스턴스 필드
	B field1 = new B();
	
	//정적 필드
	static B filed2 = new B();
	
	//A생성자 선언
	A() {
		B b = new B();
	}
	
	//인스턴스 메소드
	void method1() {
		B b = new B();
	}
	
	//정적 메소드 안에서 정적 클래스 사용 가능
	static void method2() {
		B b = new B();
	}
	
	
	//인스턴스 멤버 중첩 클래스
	class C {
		C(){
			
		}
	}
	

}
