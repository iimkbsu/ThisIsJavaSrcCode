package ch07.sec04.exam01;

public class ComputerExample {

	public static void main(String[] args) {
		
		int r = 10;
		
		Calculator myCal = new Calculator();
		System.out.println("부모클래스의 메소드 실행");
		System.out.println("반지름이 " + r + "인 원의 넓이 : "+myCal.areaCircle(r));
		System.out.println();
		
		Computer myCom = new Computer();
		System.out.println("자식클래스의 오버라이딩된 메소드 실행");
		System.out.println("반지름이 " + r + "인 원의 넓이 : "+myCom.areaCircle(r));

		
	}

}
