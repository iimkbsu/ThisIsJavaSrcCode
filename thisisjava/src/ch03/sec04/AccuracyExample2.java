package ch03.sec04;

public class AccuracyExample2 {

	public static void main(String[] args) {
		int apple = 1;
		int totalPieces = apple * 10;
		int number = 7;
		
		int result = totalPieces - number;
		System.out.println("사과 1개에서 7조각 뺀 나머지 조각 = "+result);
		System.out.println("사과 1개에서 남은 양(개) = " + result/10.0);
		
	}

}
