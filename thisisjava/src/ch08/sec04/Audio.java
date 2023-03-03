package ch08.sec04;

public class Audio implements RemoteControl {
	
	private int volume; //getter setter 사용하여 무경성 유지(조건 사용)
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다");
	}
	
	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다");
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
		System.out.println("현재 오디오 볼륨 : " + this.volume);
	}
	

}
