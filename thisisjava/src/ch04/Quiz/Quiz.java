package ch04.Quiz;

import java.util.*;

public class Quiz {

	public static void main(String[] args) {
		
		//1번. 조건문과 반복문에 대해 잘못 설명한 것은? (2)
		/*
		 1. if문은 조건식의 결과에 따라 실행 흐름을 달리할 수 있다.
		 2. switch문에서 사용할 수 있는 변수의 타입은 int, double이 될 수 있다. (x)
		 	//switch문은 정수타입(byte,char,short,int,long)과 문자열(String)만 가능
		
		 3. for문은 카운터 변수로 지정한 횟수만큼 반복시킬 때 사용할 수 있다.
		 4. break문은 switch, for, while문을 종료할 때 사용할 수 있다.
		  */
		
		//2번. switch문을 Expression(표현식)으로 변경하기
		System.out.println(" ");
		System.out.println("============Q.2============");
		
		String grade = "B";
		int score1 = 0;
		switch (grade) {
		case "A":
			score1 = 100;
		case "B":
			int result = 100 - 20;
			score1 = result;
			break;
			default:
				score1 = 60;
			
		}
		System.out.println("점수 : " + score1);
		System.out.println("------------------------");
		
		// Expression(표현식)으로 변경
		int score2 = switch (grade) {
		case "A" , "a" -> 100;
		case "B", "b" -> {
			int result = 100 - 20;
			yield result;
		}
		default -> 60;
		};
		System.out.println("점수 : " + score1);
		
		
		//3번. for문 사용하여 1~100까지 정수 중 3의 배수의 총합 출력 코드 작성
		System.out.println(" ");
		System.out.println("============Q.3============");
		
		int sum_3 = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum_3 += i;
			}
		}
		System.out.println("1~100까지 3의 배수 총 합 : " + sum_3);
		
		//4번. 주사위 두 개를 던저 (1,2)식으로 출력하고 눈의 합이 5가 될 때 프로그램 종료시키기
		System.out.println(" ");
		System.out.println("============Q.4============");
		
		label : while(true) {
			int diceOne = (int)(Math.random()*6) + 1;
			int diceTwo = (int)(Math.random()*6) + 1;
			System.out.println("(" + diceOne +", "+ diceTwo + ")");
			int sumDice = diceOne + diceTwo;
			if(sumDice == 5) {
				System.out.println("합이 5가 되어 종료됨.");
				break label;
			}
		}
		
		//5번. 4x+5y=60의 모든 해 구해서 (x,y)형태로 출력 (중첩for문 사용, x,y는 10이하 자연수)
		System.out.println(" ");
		System.out.println("============Q.5============");
		int x, y;
		for(x = 1; x<=10; x++) {
			for(y = 1; y<=10; y++) {
				if(((4*x)+(5*y)) == 60) {
					System.out.println("("+ x +"," + y +")");
				}
			}
		}
		
		//6번 아래의 모양 출력하기
		/*
		
		 *
		 **
		 ***
		 ****
		 *****
		 
		 */
		System.out.println(" ");
		System.out.println("============Q.6============");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		
		//7번. 예금 출급 잔고 종료 프로그램 만들기
		
		System.out.println(" ");
		System.out.println("============Q.7============");
		
		Scanner scanner = new Scanner(System.in);
		
		boolean key = true;
		int total = 0;
	
		
		while(key) {
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			System.out.print("선택>");
			String choice = scanner.next();
			
			if(choice.equals("1")){
				System.out.print("예금액>");
				int deposit = scanner.nextInt();
				total = total + deposit;
			}
			else if(choice.equals("2")){
				System.out.print("출금액>");
				int out = scanner.nextInt();
				if(total < out) {
					System.out.println("잔액이 부족합니다");
					continue;
				}
				else 
					total = total - out;
			}
			else if(choice.equals("3")){
				System.out.printf("잔고>%d\n", total);
				
			}
			else {
				key = false;
				System.out.println("프로그램 종료");
			}
			
			
		}
		
		

	}

}
