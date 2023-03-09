package ch09.sec05.exam01;

public class A {
	
	//static 클래스는 static 필드, 메소드만 접근 가능
	//인스턴스 클래스는 모두 접근 가능
	
	int field1;
	
	void method1() {
		System.out.println("A-인스턴스 메소드1 실행");
	}
	
	
	static int field2;
	
	static void method2() {
		System.out.println("A-정적 메소드2 실행");
	}
	
	//인스턴스 중첩 클래스 B (모든 필드, 메소드에 접근 가능)
	class B {
		void method() {
			field1 = 10;
			field2 = 10;
			method1();
			method2();
		}
	}
	
	static class C {
		static void method() {
			field2 = 0; //static 필드만 접근 가능
			method2(); //static 메소드만 접근 가능
		}
	}

}
