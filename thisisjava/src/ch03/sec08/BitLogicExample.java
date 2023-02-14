package ch03.sec08;

import java.util.Scanner;

public class BitLogicExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int a = 45;
		int b = 25;
		String binStr = Integer.toBinaryString(a);
		String binStr2 = Integer.toBinaryString(b);
		System.out.println("45 = 00" + binStr);
		System.out.println("25 = 000" + binStr2);
	
		
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = "+ (45 | 25));
		System.out.println("45 ^ 25 = "+ (45 ^ 25));
		System.out.println("~45 = "+ ~45);
		System.out.println("---------------------------");
		
		System.out.println("숫자입력 : ");
		byte receiveData = scan.nextByte();
		
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1);
		
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);
		
		int test = 136;
		byte btest = (byte) test;
		System.out.println(btest);
		
		

	}

}
