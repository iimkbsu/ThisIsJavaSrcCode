package ch06.sec07.exam04;

public class CarExample {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println(car1.company);

		Car car2 = new Car("그랜져");
		System.out.println(car2.company + " " + car2.model);
		
		Car car3 = new Car("소나타", "실버");
		System.out.println(car3.model + " " + car3.color);
		
		Car car4 = new Car(270, "M340i_LCI");
		System.out.println(car4.maxSpeed + " " + car4.model);
		
		Car car6 = new Car("그레이", 270);
		System.out.println(car6.color + " " + car6.maxSpeed);
		
		Car car5 = new Car("Cla45s", "화이트", 270);
		System.out.println(car5.model + " " + car5.color + " " + car5.maxSpeed);
	}

}
