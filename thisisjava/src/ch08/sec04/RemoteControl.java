package ch08.sec04;

public interface RemoteControl {

	//인터페이스 필드는 상수 취급 (= public static final int)
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//인터페이스 메소드는 추상메소드 취급 (abstract)
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
