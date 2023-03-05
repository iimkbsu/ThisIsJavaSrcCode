package ch08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {
		
	
		//자동 타입변환 (인터페이스 타입 변수 = 구현 클래스 객체)
		Vehicle iv = new Bus();
		
		iv.stop();
		//iv.checkFare(); //Bus 구현클래스의 추가메소드라 인터페이스에서 실행 안 됨
		
		//강제 타입변환 (checkFare() 메소드 사용하기 위해)
		Bus myBus = (Bus) iv;
		myBus.checkFare();
		
		iv.run();

	}

}
