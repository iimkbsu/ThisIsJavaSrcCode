package ch09.Quiz.Quiz04;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		//중첩 클래스의 객체 생성
		Car.Tire myTire = myCar.new Tire();
		
		//중첩 정적 클래스의 객체 생성
		Car.Engine myEngine = new Car.Engine();

	}

}
