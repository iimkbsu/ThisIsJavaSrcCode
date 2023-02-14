package ch05.sec10;

public class AdvancedForExample {

	public static void main(String[] args) {
		
		
		int[] array = {1,2,3,4,5};
		int sum = 0;
		
		//향상된 for문
		for(int a : array) {
			sum += a;
		}
		System.out.println("배열의 총 합: " + sum);
		//------------------------------------------------
		
		double[] d_array = {1,2,3,4,5};
		double d_sum = 0.0;
		
		//향상된 for문
		for(double b : d_array) {
			d_sum += b;
		}
		System.out.println("배열의 총 합 : " + d_sum);
		//---------------------------------------------------------
		
		String[] strArray = {"가", "나", "다"};
		
		for(String str : strArray) {
			System.out.print(str + " ");
		}
		System.out.println();
		//--------------------------------------------------
		
		
		int[] scores = {95, 71, 84, 93, 87};
		
		int sumScores = 0;
		int NumScores = 0;
		
		//향상된 for문
		for(int a : scores) {
			sumScores += a;
			NumScores++;
		}
		System.out.println("점수 총 합 : " + sumScores);
		System.out.println("점수 평균 : " + (double)sumScores/NumScores);
		
		
	}

}
