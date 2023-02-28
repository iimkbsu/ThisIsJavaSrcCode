package ch07.sec03.exam01;

//부모클래스 Phone을 상속받은 SmartPhone 자식클래스
public class SmartPhone extends Phone {

	//자식 생성자 선언
	public SmartPhone(String model, String color) {
		
		//부모생성자 호출
		//super(); //컴파일 시 자동 추가됨 
		
		this.model = model;
		this.color = color;
		System.out.println("SmartPhone(String model, String color) 생성자 실행");
	}
}
