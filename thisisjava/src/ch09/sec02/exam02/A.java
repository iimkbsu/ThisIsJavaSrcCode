package ch09.sec02.exam02;

public class A {

	//생성자 선언
	public A() {
	}
	
	
	//중첩 클래스 생성
	class B{
		int field1 = 1;
		static int field2 = 2;
		//B 생성자 선언
		B(){
			System.out.println("B 생성자 실행");
		}
		
		//B클래스 인스턴스 메소드
		void method1() {
			System.out.println("B 인스턴스 메소드1 실행");
		}
		
		//B클래스의 정적 메소드
		static void method2() {
			System.out.println("B 정적 메소드2 실행");
		}
	}
	
	
	//A클래스의 메소드
	void useB() {
		B b = new B();
		System.out.println("b.field1 = " + b.field1);
		b.method1();
		
		System.out.println("B.field2 = " +B.field2);
		B.method2();
	}
	
	
	
}
