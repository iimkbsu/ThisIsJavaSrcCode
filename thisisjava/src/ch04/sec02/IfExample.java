package ch04.sec02;

import java.util.*;

public class IfExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int score = input.nextInt();
		
		if(score >= 90) {
			System.out.printf("점수는 %d 이고 90보다 큼\n", score);
			System.out.printf("A 학점 입니다\n");
		}else if(80 <= score && score < 90){
			System.out.printf("점수는 %d 이고 80이거나 크고 90보다 작음\n", score);
			System.out.println("B 학점 입니다");
		}
		else {
			System.out.printf("점수는 %d이고 80보다 작음\n", score);
			System.out.println("C 학점 입니다");
		}
		

	}

}
