package ch08.sec02;


//implements = 구현하다
//구현 클래스는 인터페이스 클래스의 메소드를 전부 재정의 해줘야 함

public class Television implements RemoteControl {
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
		

	}
}
