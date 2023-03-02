package ch07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		
		
		
		//객체 생성
		SmartPhone smartPhone = new SmartPhone("둘리");
		
		smartPhone.turnOn(); //Phone 추상클래스의 메소드
		smartPhone.internetSearch(); //SmartPhone 클래스의 메소드
		smartPhone.turnOff(); //Phone 추상클래스의 메소드
		
	}
}
