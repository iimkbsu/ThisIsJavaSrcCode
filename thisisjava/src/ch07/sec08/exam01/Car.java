package ch07.sec08.exam01;

public class Car {
	//다형성 조건 > 클래스 자동타입변환 + 메소드 오버라이딩
	//필드 다형성
	Tire myTire;
	
	//필드 종류 (고유 데이터, 현재 상테 데이터, 부품 데이터)
	//부품 데이터 필드 선언
	  // == public Tire tire;
	
		
	//메소드 선언
	
	public void run() {
		myTire.roll();
	}
		//tire 필드에 대입된 객체의 roll() 메소드 호출
	

}
