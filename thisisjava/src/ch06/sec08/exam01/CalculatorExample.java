package ch06.sec08.exam01;

import java.util.Scanner;

public class CalculatorExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Calculator 객체를 myCalc의 이름으로 생성
		Calculator myCalc = new Calculator();
		
		//myCalc 이름으로 생성된 객체의 powerOn() 메소드 실행
		myCalc.powerOn();
		
		
		System.out.print("첫 번째 값 입력: ");
		int x = scanner.nextInt();
		System.out.print("두 번째 값 입력: ");
		int y = scanner.nextInt();
		
		
		System.out.println(x +"+"+ y+"=" + myCalc.plus(x, y));
		
		System.out.println(x+"/"+y+"="+myCalc.divide(x, y));

		myCalc.powerOff();
	}

}
