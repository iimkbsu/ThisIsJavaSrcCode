package ch03.sec11;

import java.util.*;
public class ConditionalOperatopnExample {
//조건연산자(삼항연산자)
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("점수 입력(0~100): ");
		int score = scanner.nextInt();
		
		char grade = (score > 90) ? 'A' : ((score >80) ? 'B': 'C');
		System.out.println("당신의 성적은 : " + grade);
		
		//-------------------------------------------------
		System.out.println("문자 입력 : ");
		String input = scanner.next();
		char input1 = input.charAt(0);
		if(input1 == 'A' || input1 == 'B' || input1 == 'C') {
		char a = (input1 == 'A')? 'A': ((input1 == 'B')? 'B': 'C');
		System.out.println("입력된 문자 : " + a);
		}
		else
			System.out.println("A,B,C 외의 문자가 입력 됨.");
		

	}

}
