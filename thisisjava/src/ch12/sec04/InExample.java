
/*
 
 System.in : 키보드 입력 필드
 
 int keyCode = System.in.read();
 키보드에서 엔터키로 구분하여 하나씩 입력된 키 값의 아스키코드를 정수형으로 저장.
 
 <아스키코드>
 엔터키 = 10, 13 동시에 들어옴 (윈도우)
 엔터키 = 10 (맥)
 
 0 = 48
 
 A = 65
 Z = 90
 
 a = 97
 z = 122
 
 */

package ch12.sec04;

import java.util.Scanner;

public class InExample {

	public static void main(String[] args) throws Exception {
		
		Scanner myscan = new Scanner(System.in);
		
		System.out.print("Initial speed : ");
		int speed = myscan.nextInt();
		
		System.out.print(".next() : ");
		String str = myscan.next(); // 다음 토큰을 문자열로 리턴 (개행문자 미포함, 개행문자나 enter로 분절하여 저장함 처음 문자열만 저장함)
		System.out.println(str);
		System.out.println(".nextLine() : ");
		String str2 = myscan.nextLine(); // '\n' 을 포함한 라인 전체를 읽고 '\n'은 버리고 리턴 (개행문자 포함)
		System.out.println(str2);
		System.out.println();
		int keyCode = 0;
		
		while(true) {
			if(keyCode != 13 && keyCode != 10) {
				if(keyCode == 49) {
					speed++;
				}else if(keyCode == 50) {
					speed--;
				}else if(keyCode == 51) {
					break ; //반복문 종료. 만약 중첩 반복문인 경우 break 선언된 안쪽 반복문만 종료. 만약 중첩 반복문의 최상위 반복문까지 종료하고 싶으면 Label 사용하여 break
				}
				
				System.out.println("-------------------------------------");
				System.out.println("1. speedUp | 2. speedDown | 3. stop");
				System.out.println("-------------------------------------");
				System.out.println("current Speed : " + speed);
				System.out.print("select Num :");
			}
			
			keyCode = System.in.read();
		}
		System.out.println("program turnOff");

	}

}
