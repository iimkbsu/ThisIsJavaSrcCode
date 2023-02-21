package ch06.sec14;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.setSpeed(-20);
		System.out.println(myCar.getSpeed());
		
		myCar.setSpeed(100);
		System.out.println(myCar.getSpeed());
		
		
		//자동차가 움직이고 있다면 정지시키는 메소드
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println(myCar.getSpeed());

	}

}
