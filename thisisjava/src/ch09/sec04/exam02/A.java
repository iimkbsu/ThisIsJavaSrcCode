package ch09.sec04.exam02;

public class A {
	
	//중첩 클래스 B
	class B {
		B(){}
		
	}
	
	//중첩 정적 클래스 C
	static class C {
		C() {}
	}
	
	
	//메소드 선언
	void useD() {
		
		//로컬 클래스, 메소드 usdD() 실행될 동안에만 D객체 사용 가능
		class D {
			
			int field1 = 1;
			static int field2 = 2;
			
			D(){
				System.out.println("D-생성자 실행");
			}
			
			void method1() {
				System.out.println("D-메소드1 실행");
			}
			
			static void method2() {
				System.out.println("D-메소드2 실행");
			}
		}
		
		
		//로컬 객체 D 생성
		D d = new D();
		System.out.println(d.field1);
		d.method1();
		
		//static 정적 멤버, 객체 생성 없이 사용 가능
		System.out.println(D.field2);
		D.method2();

	}

}
