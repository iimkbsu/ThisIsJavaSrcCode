package ch07.sec05.exam02;

public class Car {

	public int speed;
	
	
	public void speedUp() {
		System.out.println("1씩 속도 높이기");
		speed += 1;
	}
	
	
	//final 메소드, 메소드 오버라이딩 안 됨
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
	
}
