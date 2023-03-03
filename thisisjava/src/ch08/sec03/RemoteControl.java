package ch08.sec03;

public interface RemoteControl {
	
	//인터페이스 클래스는 public static final (상수)를 붙이지 않아도 필드값이 무조건 상수임
	
	//인터페이스 필드 선언 = 무조건 상수 취급 (객체 생성 없이 static이라 바로 사용 가능)
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

}
