package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A{
	
	public D() {
		//A()생성자 호출
		super();
	}
	
	public void method1(){
		//상속받은 클래스A의 필드 변경, 메소드 호출
		this.field = "value";
		this.method();
	}
	
	public void method2() {
		//컴파일에러, 직접 객체생성하면 안 됨
		/*
		A a = new A();
		a.field = "value";
		a.method();
		*/
	}

}
