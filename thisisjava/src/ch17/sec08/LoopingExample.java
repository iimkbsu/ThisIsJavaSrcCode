package ch17.sec08;

import java.util.Arrays;

public class LoopingExample {

	public static void main(String[] args) {
		
		int[] intArr = new int[] {1,2,3,4,5};
		
		//중간처리 peek()을 이용한 반복처리
		int total = Arrays.stream(intArr).filter(num -> num%2==0).peek(n -> System.out.println(n)).sum();
		System.out.println("배열에서 짝수의 총 합 : " + total);

		System.out.println();
		
		//최종처리 forEach()를 이용한 반복처리
		Arrays.stream(intArr).filter(num -> num%2==0).forEach(n -> System.out.println(n));
	}

}
