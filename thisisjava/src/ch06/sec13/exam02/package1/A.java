package ch06.sec13.exam02.package1;

public class A {

	//필드 선언
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	//생성자 선언, 어디서든 사용 가능
	public A(boolean b) {
	}
	
	//생성자 선언, 같은 패키지안에서 사용 가능
	A(int i){
	}
	
	//생성자 선언, 현재 클래스에서만 사용 가능
	private A(String s) {
	}
	
}
