package ch04.sec08;

public class ContinueExample {

	public static void main(String[] args) {
		//1~10 사이의 정수 중, 짝수만 출력하고 홀수는 빼기 (Continue 사용)
		
		//if(num % 2 != 0) = 홀수추출
		//if(num % 2 == 1) = 홀수추출
		
		int num;
		for(num = 1; num <= 10; num++) {
			if(num % 2 == 1) {
				continue;
			}
			System.out.println(num);
		}
		
		

	}

}
