package ch06.sec07.exam05;

public class Car {
	
	String model;
	String color;
	int maxSpeed;
	
	
	
	Car(String model){
		//중복코드 발생
		this.model = model;
		this.color = "RED";
		this.maxSpeed = 225;
	}
	
	Car(String model, String color){
		//중복코드 발생
		this.model = model;
		this.color = color;
		this.maxSpeed = 270;
	}
	
	Car(String model, String color, int maxSpeed){
		//중복코드 발생
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	//중복해결한 Car 객체 - CarImprovement
	
	

}
