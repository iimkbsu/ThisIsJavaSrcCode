package ch06.sec07.exam05;

public class CarImprovement {

	String company = "현대자동차";
	
	String model;
	String color;
	int maxSpeed;
	
	//this(변수or리터러, ..., ...) -> 다른 생성차 호출
	
	CarImprovement(){}
	
	CarImprovement(String model){
		//20열의 코드 호출, 생성자 첫 줄에 작성해야 함
		this(model, "RED", 225);
	}
	
	CarImprovement(String model, String color){
		//20열의 코드 호출, 생성자 첫 줄에 작성해야 함
		this(model, color, 270);
	}
	
	CarImprovement(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}
	
}
