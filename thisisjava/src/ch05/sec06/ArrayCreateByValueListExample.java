package ch05.sec06;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		
		String[] season = {"spring", "summer", "fall", "winter"};
		
		for(int i = 0; i < season.length; i++) {
			System.out.printf("season[%d] : %s\n", i, season[i]);
		}
		
		season[1] = "여름";
		System.out.println("season[1] : " + season[1]);
		
		System.out.println();
		
		int[] scores = {83, 90, 87};
		int sum = 0;
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("평균 : " + avg);
	}

}
