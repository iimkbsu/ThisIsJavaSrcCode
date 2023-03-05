package ch08.sec10.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//인터페이스 타입으로 변수 선언
		A a;
		
		//인터페이스 자동 타입 변환 (인터페이스 = 구현클래스 객체)
		a = b; //B는 인터페이스 A의 구현 클래스
		a = c; //C는 인터페이스 A의 구현 클래스
		a = d; //D는 인터페이스 A를 구현하는 B클래스의 자식클래스(상속)
		a = e; //E는 인터페이스 A를 구현하는 C클래스의 자식클래스(상속)
		
		

	}

}
