package ch07.sec07.exam01;

class A {
}

//A 클래스 상속받은 클래스 B
class B extends A{
}

//A 클래스 상속받은 클래스 C
class C extends A{	
}

//B 클래스 상속받은 클래스 D (A>B>D)
class D extends B{
}

//C 클래스 상속받은 클래스 E (A>C>E)
class E extends C{
}

public class PromotionExample {
	
	
	public static void main(String[] args) {
		
		//객체 생성
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//상속관계에서 타입변환 (A>B>D) (A>C>E)
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		//컴파일 에러 상속관계에 있지 않아서 클래스 타입변환 안 됨
		/*
		B b3 = e;
		C c2 = d;
		*/

	}

}
