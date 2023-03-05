package ch08.sec06;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl rc;
		
		rc = new Audio();
		
		rc.turnOn();
		rc.setVolume(20);
		rc.setMute(true);
		rc.setMute(false);
		rc.setVolume(4);
		rc.turnOff();
		System.out.println();
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.setVolume(40);
		rc.turnOff();
		System.out.println();
		
		//changeBattery()는 인스턴스의 정적 메소드이므로 객체생성 없이 그대로 실행가능
		//애초에 interface는 객체생성 안 됨
		RemoteControl.changeBattery();

	}

}
