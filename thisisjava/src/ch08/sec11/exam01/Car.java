package ch08.sec11.exam01;

public class Car {

	//인터페이스 타입 변수에 구현객체 대입 (자동타입변환)
	Tire t1 = new HankookTire();
	Tire t2 = new KumhoTire();
	
	//생성자
	public Car() {
	};
	
	//메소드 선언
	void run() {
		t1.roll();
		t2.roll();
	}
}
