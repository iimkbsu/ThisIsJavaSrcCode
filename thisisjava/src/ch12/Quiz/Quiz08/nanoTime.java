

//나노초 단위로 main 메소드 실행시간 구하기
package ch12.Quiz.Quiz08;

public class nanoTime {
	
	public static void main(String[] args) {
		
		//추가문
		long startTime = System.nanoTime();
		
		int[] scores = new int[1000];
		
		for(int i=0; i<scores.length; i++) {
			scores[i] = 1;
		}
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		
		double avg = sum/scores.length;
		System.out.println(avg);
		
		//추가문
		System.out.println((System.nanoTime() - startTime + "ns"));

	}

}
