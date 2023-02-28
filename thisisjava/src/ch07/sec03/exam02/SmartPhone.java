package ch07.sec03.exam02;

public class SmartPhone extends Phone{
	
	//매개변수가 있는 생성자 선언
	public SmartPhone(String model, String color) {
		//super();는 매개변수가 없으므로 컴파일 에러 남
		super(model, color); // 부모클래스의 매개변수 생성자가 있는 경우 반드시 작성해야 함
		System.out.println("SmartPhone(String model, String color) 생성자 실행");
	}

}
