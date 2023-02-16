package ch06.sec10.exam01;

public class Calculator {

	static double pi = 3.141592;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
	
	String color;
	
	void setColor(String color) {
		this.color = color;
		System.out.println("색상 : " + this.color);
	}
}
