package ch06.sec10.exam01;

public class Calculator {
	
	//정적 필드는 생성자에서 초기화하지 않는다.

	//정적 필드
	static double pi = 3.141592;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	//정적 블록
	static int minus(int x, int y) {
		return x - y;
	}
	
	//인스턴스 필드
	String color;
	
	void setColor(String color) {
		//인스턴스 필드 초기화
		this.color = color;
		System.out.println("색상 : " + this.color);
	}
}
