package ch07.sec04.exam02;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		
		SuperSonicAirplane myAir = new SuperSonicAirplane();
		
		myAir.takeOff();
		myAir.fly();
		myAir.flyMode = SuperSonicAirplane.SUPERSONIC;
		myAir.fly();
		myAir.flyMode = SuperSonicAirplane.NORMAL;
		myAir.fly();
		myAir.land();

	}

}
