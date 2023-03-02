package ch07.sec08.exam02;

public class Driver {
	
	//매개변수 다향성
	//클래스를 매개변수로 (자식객체를 매개변수로 하면 자동타입변환 발생)
	public void driver(Vehicle vehicle) {
		vehicle.run();
	}

}
