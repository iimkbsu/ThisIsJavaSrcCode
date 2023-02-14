package ch05.sec05;

import java.util.Scanner;

public class LengthExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("주민번호 입력: ");
		String ssn = scanner.next();
		//next() nextLine() 차이
		// 둘 다 String 타입
		// next() 공백(스페이스or엔터)전까지 입력받은 문자열을 반환
		// nextLine()은 스페이스나 엔터값도 입력받아 반환
		
		int ssnLength = ssn.length();
		if(ssnLength == 13) {
			System.out.println("주민번호 자릿수 맞음");
		}else
			System.out.println("주민번호 자릿수 틀림");

	}

}
