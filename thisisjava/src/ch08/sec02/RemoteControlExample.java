package ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		//인터페이스 타입을 변수타입으로 설정 가능
		RemoteControl rc;
		//인터페이스 타입은 참조 타입이므로 참조 주소가 변수값으로 초기화
		rc = new Television();
		//RemoteControl rc = new Television();
		
		rc.turnOn();
		
		
		//Audio 객체로 교체
		rc = new Audio();
		rc.turnOn();

		
	
	}

}
