package ch09.sec05.exam02;

public class A {
	
	//A 필드
	String field = "A-field";
	
	//A 인스턴스 메소드
	void method() {
		System.out.println("A-method()");
	}
	
	
	
	//B 중첩클래스
	class B {
		String field = "B-field";
		
		void method() {
			System.out.println("B-method()");
		}
		
		void print() {
			System.out.println(this.field); //B 클래스의 필드 (field 해줘도 됨)
			this.method(); // B 클래스의 메소드 (method(); 해줘도 됨)
			System.out.println();
			
			System.out.println(A.this.field); //A 클래스의 필드
			A.this.method(); // A 클래스의 메소드
		}
	}
	
	
	//A 인스턴스 메소드
	void useB() {
		B b = new B();
		b.print();
	}
	

}
