package ch06.sec07.exam05;

import ch06.sec07.exam04.Car;

public class CarExample {

	public static void main(String[] args) {
		
		CarImprovement car1 = new CarImprovement();
		System.out.println(car1.company);

		CarImprovement car2 = new CarImprovement("그랜져");
		System.out.println(car2.company + " " + car2.model);
		
		CarImprovement car3 = new CarImprovement("소나타", "실버");
		System.out.println(car3.model + " " + car3.color);
		
		
		CarImprovement car4 = new CarImprovement("m340i_LCI", "그레이");
		System.out.println(car4.color + " "+car4.model);

		
		CarImprovement car5 = new CarImprovement("Cla45s", "화이트", 270);
		System.out.println(car5.model + " " + car5.color + " " + car5.maxSpeed);

	}

}
