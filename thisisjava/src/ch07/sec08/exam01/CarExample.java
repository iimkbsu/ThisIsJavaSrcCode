package ch07.sec08.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		//Car 객체 생성
		
		Car myCar = new Car();
		
		//Tire 객체 장착
		myCar.myTire = new Tire();
		myCar.run();
		
		//HankookTire 객체 장착
		myCar.myTire = new HankookTire();
		myCar.run();
		
		//KumhoTire 객체 장착
		myCar.myTire = new KumhoTire();
		myCar.run();
	}

}
