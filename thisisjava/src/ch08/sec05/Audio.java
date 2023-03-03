package ch08.sec05;


public class Audio implements RemoteControl {
	
	//private 필드
	private int volume; //getter, setter 사용하여 무결성 유지(조건 사용)
	
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
		System.out.println("오디오 볼륨 설정 : " + this.volume);
	}
	
	
	
	private int memoryVolume;
	
	//인터페이스 default 메소드 재정의 (default 키워드 생략, public 접근 제한 필수) 
	//음소거 할 때 현재 볼륨을 기억하고 있다가 음소거 해제시 이전 볼륨으로 켜지도록 하는 메소드
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.print("음소거 합니다   ");
			setVolume(MIN_VOLUME);
		}else {
			System.out.print("음소거를 해제합니다   ");
			setVolume(this.memoryVolume);
		}
	}
}
