package ch06.sec08.exam01;

public class Calculator {

	
	//return 값 없는 메소드
	void powerOn() {
		System.out.println("계산기의 전원을 켭니다");
	}
	
	//return 값 없는 메소드
	void powerOff() {
		System.out.println("계산기의 전원을 끕니다");
	}
	//return 값이 int 형인 메소드 (매개변수 int a, int b)
	int plus(int a, int b) {
		int result = a + b;
		return result;
	}
	
	//return 값이 double 형인 메소드 (매개변수 int a, int b)
	double divide(int a, int b) {
		double result = (double)a/b;
		return result;
	}
	
}
