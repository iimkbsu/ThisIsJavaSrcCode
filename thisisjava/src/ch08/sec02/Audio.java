package ch08.sec02;

public class Audio implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다");
	}
}
