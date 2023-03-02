package ch07.sec05.exam02;

public class SportCar extends Car{
	
	@Override
	public void speedUp() {
		System.out.println("10씩 속도 높이기");
		speed += 10;
	}
	
	
	//final 메소드는 오버라이딩 안 됨
	/*
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	*/
}
