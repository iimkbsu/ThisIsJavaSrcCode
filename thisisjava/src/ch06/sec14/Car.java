package ch06.sec14;

public class Car {
	
	//Source 메뉴에서 generate getter/setter 하면 자동으로 생성됨
	
	//접근 제한하기 위해 private으로 필드 생성
	private int speed;
	private boolean stop;
	
	
	//private 필드 접근하기 위한 getter
	public int getSpeed() {
		return speed;
	}
	
	//setter
	public void setSpeed(int speed) {
		
		if(speed < 0) {
			this.speed = 0;
			return;
		}
		else {
			this.speed = speed;
		}
		
		
	}
	
	//boolean getter는 get대신 is 사용
	public boolean isStop() {
		return stop;
	}
	
	//setter
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) {
			this.speed = 0;
		}
	}

}
