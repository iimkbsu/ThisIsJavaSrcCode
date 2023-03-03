package ch08.sec04;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		//인터페이스 변수에 텔레비전 객체, 오디오 객체 대입하여 인터페이스로 각 객체 사용
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(11);
		rc.turnOff();

	}

}
