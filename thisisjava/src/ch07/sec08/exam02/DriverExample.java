package ch07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver myDriver = new Driver();
		
		
		//Vehicle myVehicle = new Vehicle();
		//myDriver.driver(myVehicle);
		
		// 매개변수 다형성 발생
		Bus myBus = new Bus();
		myDriver.driver(myBus); //클래스 자동타입변환 발생
		
		Taxi myTaxi = new Taxi();
		myDriver.driver(myTaxi); //클래스 자동타입변환 발생

	}

}
