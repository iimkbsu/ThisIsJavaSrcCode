package ch09.sec02.exam02;

public class AExample {

	public static void main(String[] args) {
		
		//static method2()라 바로 호출 가능
		A.B.method2();
		System.out.println();
		
		//A객체 생성 후 usbB() 메소드 호출
		A a = new A();
		a.useB();
		System.out.println();
		
		
		//B객체 생성
		A.B b = a.new B();
		b.method1();
		
	}

}
