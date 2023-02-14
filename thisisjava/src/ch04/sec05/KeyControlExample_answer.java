package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample_answer {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		
		int speed = 0;
		
		while(run) {
			System.out.println("------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("------------------------");
			System.out.print("선택 : ");
			
			
			String strNum = scanner.nextLine();
			
			/** 
			== 와 equals()의 차이점
			1. equals()는 메소드, ==는 비교연산자
			2. equals()는 객체끼리 비교가능 , 내용 자체를 비교 (문자열str)
			3. ==는 비교하고자 하는 대상의 주소값 비교 (char,정수형,double형)
			 */
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 : " + speed);
			}
			else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 : " + speed);
			}
			else if(strNum.equals("3")) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		
		

	}

}
