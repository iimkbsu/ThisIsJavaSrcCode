package ch06.sec07.exam04;


public class Car {
	
	//필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 선언 (생성자 이름은 동일한데 매개변수 조합이 다른 것들 만듦 = 오버로딩)
	// 아래의 예
	// 1.No매개변수 2.String 3.String String 4.int String 5.String String int
	
	/***
	 * 빈 매개변수
	 * String model
	 * String model, String color
	 * int maxSpeed, String model
	 * String color, int maxSpeed
	 * String model, String color, int maxSpeed
	 */
	
	Car(){}
	
	
	Car(String model){
		this.model = model;
	}
	
	//오버로딩 에러 발생
	//Car(String color){
	// this.color = color
	//}

	
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	
	Car(int maxSpeed, String model){
		this.maxSpeed = maxSpeed;
		this.model = model;
	}
	
	Car(String color, int maxSpeed){
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	

	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	

}
