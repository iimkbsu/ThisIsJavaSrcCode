package ch08.sec04;

public class Main {

	public static void main(String[] args) {
		
		//이런식으로 하면 인터페이스 거치지 않고 바로 Television클래스, Audio클래스에서 실행 함
		Audio myAudio = new Audio();
		Television myTv = new Television();
		
		myAudio.turnOn();
		myAudio.setVolume(20);
		myAudio.setVolume(-10);
		myAudio.setVolume(5);
		myAudio.turnOff();
		System.out.println();
		
		
		myTv.turnOn();
		myTv.setVolume(10);
		myTv.turnOff();

	}

}
