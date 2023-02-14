package ch05.sec06;

import java.util.*;

public class OwnPractice_ScoreAvg {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean check = true;
		int numScore = 0;
		while(check) {
			System.out.print("몇 개의 점수를 입력하나요? : ");
			numScore = scanner.nextInt();
			if(numScore < 5 || numScore >10) {
				System.out.println("개수를 다시 입력하세요 (5~10개)");
			}else {
				break;
			}
		}
		System.out.println("최소, 최대값 제외한 평균점수 : " + Avg(numScore));

	}
	
	public static double Avg(int a) {
		Scanner scanner1 = new Scanner(System.in);
		int sum = 0;
		double Mmavg = 0;
		int[] scores = new int[a];
		for(int i= 0; i<a; i++) {
			System.out.print( (i +1) + " 번 째 점수를 입력하세요 : \n");
			scores[i] = scanner1.nextInt();
		}
		
		//입력받은 점수에서 최소, 최대 값 제외한 평균 점수 구하기
		for(int i=0; i < a; i++) {
			for(int j=0; j<a; j++) {
				int temp = 0;
				 
				//scores[i] > scores[j] = 내림차순 정렬. 
				//어짜피 처음과 끝 인덱스의 숫자 제외라서 어떤 걸 써도 상관 없음
				
				//오름차순 정렬. 
				if(scores[i] < scores[j]) { 
					temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;
				}	
			}
		}
		//최소, 최대 제외 합, 평균 구하고 메소드 실행 값 리턴
		for(int i=1; i < (a-1); i++) {
			sum +=scores[i];
		}
		
		Mmavg = (double)sum / (a-2);
		
		return Mmavg;
	}

}
