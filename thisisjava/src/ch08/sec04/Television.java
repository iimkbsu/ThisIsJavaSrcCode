package ch08.sec04;

public class Television implements RemoteControl {

	private int volume; //getter setter 사용하여 무결성 유지(조건 사용)
	
	@Override
	public void turnOn() {
		System.out.println("티비를 켭니다");
	}
	
	@Override
	public void turnOff() {
		System.out.println("티비를 끕니다");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		}else if(volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 티비 볼륨 : " + this.volume);
	}
}