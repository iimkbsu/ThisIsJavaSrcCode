package ch03.sec09;

import java.util.Scanner;

public class BitShiftExample2 {

	public static void main(String[] args) {
		
		System.out.println("772 입력: ");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt(); //772
		
		String binary_value = Integer.toBinaryString(value);
		System.out.printf("비트로 표현 = %s\n",binary_value);
		// 00000000 00000000 00000011 00000100
		
		//우측으로 3byte 이동하고 끝 1바이트만 읽음 : 00000000
		byte byte1 = (byte)(value >>> 24);// 00000000
		int int1 = byte1 & 255; //비트 논리곱
		System.out.println("\n우측으로 3byte 시프팅하고 끝 1byte만 읽음");
		System.out.println("첫 번째 바이트 부호 없는 값 : "+int1);
		
		//우측으로 2byte 이동하고 끝 1바이트만 읽음 :00000000
		byte byte2 = (byte) (value >>> 16);
		int int2 = Byte.toUnsignedInt(byte2);
		System.out.println("\n우측으로 2byte 시프팅하고 끝 1byte만 읽음");
		System.out.println("두 번째 바이트 부호 없는 값 : "+int2);
		
		//우측으로 1byte 이동하고 끝 1바이트만 읽음 : 00000011
		byte byte3 = (byte) (value >>> 8);
		int int3 = byte3 & 255;
		System.out.println("\n우측으로 1byte 이동하고 끝 1바이트만 읽음");
		System.out.println(int3);
		
		
		
	}

}
