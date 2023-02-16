package ch06.sec08.exam02;

public class Computer {
	
	//가변길이 매개변수를 갖는 메소드 선언 (같은 타입이어야 함)
	//(int...values) 넘겨받는 방식 (int,int,int) or ({int, int, int})
	int sum(int...values) {
		int sum = 0;
		
		for(int i = 0; i < values.length; i++) {
			sum +=values[i];
		}
		
		return sum;
	}
	
	//배열타입
	int sum2(int[] values) {
		
		int sum = 0;
		for(int i = 0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

}
