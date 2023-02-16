package ch06.sec08.exam02;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Computer myCom = new Computer();
		
		int result3 = myCom.sum(1,2,3);
		
		int result4 = myCom.sum(1,2,3,4);
		
		int[] valuess = new int[] {1,2,3,4,5};
		int result5 = myCom.sum(valuess);
		
		int[] values = {1,2,3,4,5,6};
		
		
		
		int result7 = myCom.sum(new int[] {1,2,3,4,5,6,7});
		
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(myCom.sum(values));
		System.out.println(result7);
		
		int[] inputValues = new int[8];
		
		System.out.println("숫자 여덟개 입력:");
		for(int i =0;i<inputValues.length ;i++) {
			inputValues[i] = scanner.nextInt();
		}
	
		
		System.out.println(myCom.sum(inputValues));
		
		System.out.println("---------------------------");

		
		Computer myCom2 = new Computer();
		int[] testA = {1,2,3};
		System.out.println(myCom2.sum2(testA));
		
		int[] testB = {1,2,3,4};
		System.out.println(myCom2.sum2(testB));
		
		//System.out.println(myCom2.sum2(1,2,3,4)); //컴파일에러. 배열 아님
		//System.out.println(myCom2.sum2({1,2,3,4})); //컴파일에러. 배열 힙 영역 생성 해야 함
		System.out.println(myCom2.sum2(new int[] {1,2,3,4,5}));

	}

}
