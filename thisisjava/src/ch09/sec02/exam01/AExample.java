package ch09.sec02.exam01;

public class AExample {

	public static void main(String[] args) {
		
		//A객체 생성
		A a = new A();
		a.methodA();
		
		//A클래스 안에 중첩 선언 된 B클래스를 타입으로 b변수 선언 후
		//생성된 A객체 a 안에서 B객체 생성
		A.B b = a.new B();
		b.methodB();
		

	}

}
