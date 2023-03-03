package ch08.sec05;

public interface RemoteControl {
	

	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//default 메소드 (추상 메소드와 다르게 실행부가 존재, 구현 객체들의 메소드가 같을 때 편리함) 
	//단, 인터페이스만으로는 실행될 수 없고 반드시 객체가 있어야하므로 인터페이스를 구현하는 클래스의 객체에서 실행해야 함
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.print("음소거 합니다   ");
			setVolume(MIN_VOLUME);
		}else {
			System.out.print("음소거 해제합니다  ");
			
		}
	}
	
}
