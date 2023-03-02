package ch07.sec06.package1;

public class B {
	
	public void method() {
		
		//A 클래스의 생성자로 a 인스턴스 생성
		A a = new A();
		
		//같은 패키지의 A 클래스의 protected 필드 참조 및 값 변경
		a.field = "value";
		//같은 패키지의 A 클래스의 protected 메소드 사용
		a.method();
	}

}
