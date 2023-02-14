package ch05.sec05;

import java.util.*;

public class CharAt {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요 : ");
		String idNum = scanner.nextLine();
		
		System.out.println(idNum.charAt(6));
		
		if(idNum.charAt(6) == '1' || idNum.charAt(6) == '3' ) {
			System.out.println("남성입니다.");
		}else if(idNum.charAt(6) == '2' || idNum.charAt(6) == '4') {
			System.out.println("여성입니다.");
		}

	}

}
