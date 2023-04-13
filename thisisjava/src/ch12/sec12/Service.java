package ch12.sec12;

public class Service {
	
	@PrintAnnotation
	public void method1() {
		System.out.println("메소드1 실행내용");
	}
	
	//String value()이므로 속성명 없이 변경가능
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("메소드2 실행내용");
	}
	
	//두 개 이상 속성 변경 시 속성명 다 써줘야 함
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("메소드3 실행내용");
	}

}
