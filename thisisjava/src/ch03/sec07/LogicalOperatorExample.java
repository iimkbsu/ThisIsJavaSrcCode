package ch03.sec07;

import java.util.Scanner;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/**
		 * 
		 * Scanner() Method
		 * next(): String, 다음 토큰을 문자열로 return
		 * nextLine(): String, '\n'을 포함하는 한 line을 읽고 '\n'을 버린 나머지만 return
		 * nexyByte(): byte, 다음 토큰을 byte 타입으로 return
		 * nextShort(): short, 다음 토큰을 short 타입으로 return
		 * nextInt(): int, 다음 토큰을 int 타입으로 return
		 * nextLong(): long, 다음 토큰을 float 타입으로 return
		 * nextDouble(): double, 다음 토큰을 double 타입으로 return
		 * close(): void, Scanner의 사용 종료
		 * hasNext(): boolean, 현재 입력된 토큰이 있으면 true, 아니면 새로운 입력이 들어올 때까지 무한정 기다리면서 새로운 입력이 들어오면 그 때 true return, ctrl+z 키가 입력되면 입력 끝으로 false return
		 * */
		
		
		
		while(true) {
			
			System.out.println("문자 입력 (느낌표입력시 종료) : ");
			String StringCode = scanner.nextLine();
			
			int charCode = StringCode.charAt(0);
		
			if((65 <= charCode) & (charCode <=90)) {
				System.out.println("대문자");
			}
			if((97 <= charCode) && (charCode <=122)) {
				System.out.println("소문자");
			}
			if((48 <= charCode) && (charCode <=57)) {
				System.out.println("0~9 숫자");
			}
			//char '!'는 int 33으로 자동타입변환
			// charCode == 33 하고 같음
			if(charCode == '!') { 
				System.out.println("종료");
				break;
			}
		
		}
		
		System.out.println("숫자입력 : ");
		int code = scanner.nextInt();
		System.out.println(code);
		
		if(code %2 == 0 | code % 3 == 0) {
			System.out.println("2or3의 배수");
		}
		
		
		boolean result = ( code % 2 == 0 || code % 3 == 0 );
		if(!result) {
			System.out.println("2or3의 배수가 아님");
		}

	}

}
