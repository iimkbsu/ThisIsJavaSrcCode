package ch03.sec04;

public class AccuracyExample {

	public static void main(String[] args) {
		int apple = 1; //10조각 = 1개의 사과
		double pieceUnit = 0.1; //1조각
		int number = 7;
		
		double result = apple - number*pieceUnit; //사과 1개에서 7조각을 뺌.
		System.out.println(result);

	}

}
