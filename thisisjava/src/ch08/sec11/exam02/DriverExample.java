package ch08.sec11.exam02;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//Driver 객체의 driver()메소드에 구현객체를 매개값으로 대입하여 호출
		driver.driver(bus);
		driver.driver(taxi);

	}

}
