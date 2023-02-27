package ch06.sec15;

public class Singleton {
	
	//private static 클래스명으로 필드 선언 및 객체생성 초기화
	private static Singleton singleton = new Singleton();
	
	//접근 제한 private으로 생성자 선언 (외부에서 new 연산자로 객체생성 막음)
	private Singleton() {
		
	}
	
	//public으로 정적 메소드 선언
	static Singleton getInstance() {
		return singleton; //return 타입 class
	}

}
