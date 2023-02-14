package ch03.Quiz;

import java.util.*;

public class Quiz {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//Q1
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z); //31
		
		//Q2
		int score = 85;
		String result = (!(score > 90)) ? "가" : "나"; //NOT(False) = True
		System.out.println(result); // 가
		
		//Q3 같은 개수로 연필 나눠주기
		int pencils = 534;
		int students = 30;
		
		//학생 한 명이 가지는 연필의 수
		int pencilsPerStudents = 534/30;
		System.out.println(pencilsPerStudents);
		
		//남은 연필의 수
		int pencilsLeft = 534 - (pencilsPerStudents * 30);
		System.out.println(pencilsLeft);
		
		
		//Q4 십의자리 이하를 버리기
		System.out.println("정수입력 : ");
		int value = scanner.nextInt();
		
		System.out.println("십의자리 이하 버린 수 :" + (value - (value%100)));//조건: 산술연산자만 사용하라

		
		//Q5 사다리꼴 넓이 구하기
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop + lengthBottom)/2.0 * height;
		System.out.println("사다리꼴 넓이 : " + area);
		
		
		//Q6
		int x1 = 10;
		int y1 = 5;
		
		System.out.println((x1>7) && (y1 <= 5)); //True && True = True 
		System.out.println((x1%3 == 2) || (y1%2 != 1)); // False || Flase = False
		
		
		//Q7 수행 결과값에 10 더하는 코드, NaN 값을 검사하여 올바른 결과 출력시켜라
		double x2 = 5.0;
		double y2 = 0.0;
		double z2 = 5 % y2;
		
		if(Double.isInfinite(z2) || Double.isNaN(z2)) {
			System.out.println("0.0으로 나눌 수 없다.");
		}
		else {
			double result2 = z2 + 10;
			System.out.println("결과 : " + result2);
		}
		
		
		
		
	}

}
