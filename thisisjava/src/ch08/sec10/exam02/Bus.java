package ch08.sec10.exam02;

public class Bus implements Vehicle {
	
	@Override
	public void stop() {
		System.out.println("버스가 정지합니다");
	}

	@Override
	public void run() {
		System.out.println("버스가 달립니다");
	}
	
	
	//추가메소드
	public void checkFare() {
		System.out.println("승차요금 확인합니다");
	}
}
