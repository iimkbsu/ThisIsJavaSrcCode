package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) {
		
		//1을 입력하면 증속, 2를 입력하면 감속 3을 입력하면 중지하는 프로그램
		
		Scanner scanner = new Scanner(System.in);
		
		int speed = 0;
		
		while(true) {
			
			System.out.println("------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("------------------------");
			System.out.print("선택 :");
			int choice = scanner.nextInt();
			
			if(choice == 1) {
				speed++;
				System.out.println("현재속도 : " + speed);
			}
			else if(choice == 2) {
				speed--;
				System.out.println("현재속도 : " + speed);
			}
			else {
				System.out.println("프로그램 종료");
				break;
			}
		}
		

	}

}
