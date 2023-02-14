package ch04.sec02;

import java.util.*;

public class IfDiceExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 0.0 <= Math.random() < 1.0
		// 0.0 <= Math.random()*6 < 6.0
		// 1.0 <= Math.random()*6 + 1 < 7.0
		// (int)(Math.random()*6+1) = 1, 2, 3, 4, 5, 6
		int num = (int)(Math.random()*6) + 1;
		System.out.printf("주사위를 굴려 %d이(가) 나왔습니다.\n" ,num);
		System.out.println("----------로또 번호 예측하기--------------");
		
		System.out.println("횟수 입력 : ");
		int counts = scanner.nextInt();
		
		for(int j = 0; j <counts; j++) {
			System.out.printf("%d회차 : ",j+1);
			for(int i=1; i<7; i++){
				int lotto = (int)(Math.random()*45) + 1;
				System.out.printf("%d, ", lotto);
				
			}
			System.out.printf("\n");
		}

	}

}
