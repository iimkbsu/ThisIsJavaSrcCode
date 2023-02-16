package ch06.sec09;

public class Car {
	//필드 or 메소드는 선언 방식에 따라 정적맴버, 인스턴스맴버로 나뉨
	//정적맴버 (static, 객체생성 없이 사용 가능, this 사용 불가)
	//인스턴스맴버 (객체생성 필요, this 사용 가능)
	
	
	//필드선언
	String model;
	int speed;
	
	//생성자 선언
	Car(String model){
		//this 생략 불가
		this.model = model;
	}
	
	//메소드 선언
	void setSpeed(int speed) {
		//this 생략 불가
		this.speed = speed;
	}
	
	//메소드 선언
	void run() {
		//this 3개 모두 생략 가능
		this.setSpeed(100);
		System.out.println(this.model +" : "+ this.speed+"Km/h");
	}
	
	void run2() {
		setSpeed(200);
		System.out.println(model +" : "+ speed+"Km/h");
	}

}
