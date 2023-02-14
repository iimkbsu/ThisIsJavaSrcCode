package ch02.sec13;

import java.util.Scanner; //Scanner는 기본 제공 변수타입이 아니라서 클래스를 import 시켜줘야 함
// ctrl + shift + o 하면 자동으로 클래스 import 시켜줌

public class ScannerExample {

	public static void main(String[] args) {
		
		/**scanner*/
		Scanner scanner = new Scanner(System.in);
		System.out.print("x 값 입력: ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("y 값 입력: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y =" + result);
		//sysout + ctrl + space
		
		while(true) {
			System.out.println("입력 문자열: ");
			String data = scanner.nextLine();
			if(data.equals("q")){ //문자열변수.equals("문자열"); //문자열끼리 비교
				break;
			}
			System.out.println("출력 문자열 : " + data);
			
		}
		
		/*
		 while(true) {
			System.out.println("입력 문자: ");
			char data = scanner.nextLine().charAt(0);
			if(data == 'q'){ //문자열에서는 사용 못 하고 문자나 숫자만 가능
				break;
			}
			System.out.println("출력 문자열 : " + data);
			
			
		}
		*/
		
		System.out.println("종료");

	}

}

