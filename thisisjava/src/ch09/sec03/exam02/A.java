package ch09.sec03.exam02;

public class A {
	
	
	static class B {
		
		//인스턴스 필드
		int field1 = 1;
		//정적 필드
		static int field2 = 2;
		
		B(){
			System.out.println("B-생성자 실행");
		}
		
		void method1() {
			System.out.println("B-인스턴스 메소드1 실행");
		}
		
		static void method2() {
			System.out.println("B-정적 메소드2 실행");
		}
	}
	

}
