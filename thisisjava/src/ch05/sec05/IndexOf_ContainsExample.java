package ch05.sec05;

import java.util.Scanner;

public class IndexOf_ContainsExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// 가나다라마바사아자차카타파하
		String hangel = scanner.next();

		
		int indexof = 1 + hangel.indexOf("라");
		System.out.printf("'라'는 몇 번째 글자 입니까? : %d\n", indexof);
		
		int indexof1 = hangel.indexOf("A");
		if(indexof1 == -1) {
			System.out.println("indexOf반환 :" +indexof1);
			System.out.println("'A'는 포함되어있지 않은 문자열임");
		}
		
		
		boolean exist = hangel.contains("카");
		System.out.print("문자열에 '카'가 존재 합니까? : " + exist);

	}

}
