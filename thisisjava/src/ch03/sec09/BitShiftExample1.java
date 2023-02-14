package ch03.sec09;

import java.util.Scanner;

public class BitShiftExample1 {

	public static void main(String[] args) {
		//캐스팅 = 작은 자료형에 큰 자료를 강제로 대입하는 것
		//파싱 = 문자열 or 바이너리 데이터 열에서 원하는 값 추출하는 것
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num1 = scanner.nextInt();
		int result1 = num1 << 3; //비트 시프팅 좌측 3칸 이동 후 우측빈칸에 0 기입 시프팅하면 강제 int
		// 00000000 00000000 00000000 00000001 (1)
		// 00000000 00000000 00000000 00001000 (8)
		int result2 = num1 * (int) Math.pow(2, 3);//Math.pow()하면 double값 반환 (int)로 캐스팅
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		System.out.println("-8 입력 : ");
		int num2 = scanner.nextInt(); //-8
		String binary = Integer.toBinaryString(num2);
		System.out.println(binary);
		
		int result3 = num2 >> 3;
		int result5 = num2 >>> 3;
		// 11111111 11111111 11111111 11111000 (-8)
		// 11111111 11111111 11111111 11111111 (-1) -8 >> 3
		// 00011111 11111111 11111111 11111111 -8 >>> 3
		int result4 = num2 / (int)Math.pow(2, 3); // -8/8 = -1
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		

	}

}
