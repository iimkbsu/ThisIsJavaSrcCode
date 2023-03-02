package ch07.sec10.exam01;

//추상클래스 선언 (여러 클래스들의 공통된 필드, 메소드를 추상화 하여 한데 모아 클래스 선언, 추상 클래스로는 객체생성 안 됨)
public abstract class Phone {

	//필드 선언
	String owner;
	
	//생성자 선언
	Phone(String owner){
		this.owner = owner;
	}
	
	//메소드 선언
	void turnOn() {
		System.out.println("휴대폰 전원을 켭니다");
	}
	
	void turnOff() {
		System.out.println("휴대폰 전원을 끕니다");
	}
}
