package ch05.sec05;

import java.util.*;

public class CharAtExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요 : ");
		String idNum = scanner.nextLine();
		
		char sex = idNum.charAt(6);
		
		switch(sex) {
			case '1', '3':
				System.out.println("남성입니다");
			break;
			case '2', '4':
				System.out.println("여성입니다");
			break;
			
		}

	}

}
