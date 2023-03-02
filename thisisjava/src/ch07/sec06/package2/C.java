package ch07.sec06.package2;

import ch06.sec13.exam03.package1.A;

public class C {
	
	public void method() {
		
		//public A 클래스 생성자 실행 후 인스턴스 생성
		A a = new A();
		
		//protected 필드와 메소드라서 다른 패키지의 상속된 클래스에서만 사용 가능, 컴파일 에러
		//a.field = "Value";
		//a.method();
	}

}
