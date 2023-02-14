package ch02.sec09;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte result1 = 10 + 20; // == byte result1 = 30;
		System.out.println("result1 = " + result1);

		byte v1 = 10;
		byte v2 = 20;
		//byte v3 = v1 + v2; 에러 (리터럴 연산은 컴파일 전에 가능하지만 변수끼리 연산은 기본적으로 int, double 형)
		int result2 = v1 + v2;
		System.out.println("result2 = " +result2);
		System.out.println("v1 + v2 = " +v1 + v2);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		//int result3 = v3 + v4 + v5; (long 형이여야 함)
		long result3 = v3 + v4 + v5;
		System.out.println("result3 = " +result3);
		System.out.println("v1 + v2 + v3 = " +v3 + v4 + v5);
		
		char v6 = 'A'; //65
		char v7 = 65;
		int result4 = v6 + v7;
		System.out.println("result4 = " + result4);
		System.out.println("v6 + v7 = " + v6 + v7);
		
		int v8 = 10;
		int result5 = v8/ 4;
		float result6 = v8/4;
		System.out.println("result5 = " + result5);
		System.out.println("result6 = " + result6);
		System.out.println("v8/4 = " + v8/4);
		
		int v9 = 10;
		float result7 = (float)v9/3;
		float result10 = v9/3;
		System.out.println("result10 = " + result10);
		System.out.println("result7 = " + result7);
		
		
		double v10 = 10.0;
		double result8 = v10/3.0;
		System.out.println("result8 = " + result8);
		
		int v11 = 1;
		int v12 = 2;
		double result9 = v11/v12;
		System.out.println("result9 = " +result9);
		
		int v13 = 1;
		int v14 = 2;
		double result11 = (double)v13/v14;
		System.out.println("result11 = " +result11);
		
		
		
		
		
		
	}

}
