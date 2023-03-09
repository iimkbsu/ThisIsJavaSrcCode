package ch08.sec12;

public class InstanceExample {

	public static void main(String[] args) {
		
		//구현객체생성
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		
		//ride() 구현객체를 매개변수로 메소드 호출 (자동타입변환)
		ride(taxi);
		System.out.println();
		ride(bus);
		
		

	}
	
	//ride() 메소드 선언
	public static void ride(Vehicle vehicle) {
		//java12 부터 instanceof 결과가 true일 경우 우측 타입변수 바로 사용 가능
		if(vehicle instanceof Bus bus) {
			bus.checkFare();
		}
		
		vehicle.run();
	}
	
	
	/*
	 public static void ride(Vehicle vehicle){
	 	if(vehicle instanceof Bus){
	 		Bus bus = (Bus) vehicle; //checkFare() 메소드는 버스에만 있어서 강제타입변환
	 		bus.checkFare();
	 	}
	 }
	 */

}
