package ch17.sec09;


import java.util.Arrays;

import java.util.stream.IntStream;

public class MatchingExample {

	public static void main(String[] args) {
		
		int[] intArr = {2,4,6};

		IntStream intStream = Arrays.stream(intArr);
		System.out.print("배열 : ");
		intStream.forEach(num -> System.out.print(" "+num));
		System.out.println();
		
		boolean result = Arrays.stream(intArr).allMatch(num -> num%2==0);
		System.out.println("배열의 값이 모두 짝수인가? : " + result);
		
		
		result = Arrays.stream(intArr).anyMatch(num -> num == 4);
		System.out.println("배열 중에 4가 있는가? :" + result);
		
		result = Arrays.stream(intArr).anyMatch(num -> num%3==0);
		System.out.println("배열 중에 3의 배수가 하나이상 있는가? : " + result);
		
		
		result = Arrays.stream(intArr).noneMatch(num -> num%2==0);
		System.out.println("배열 중에 2의 배수가 없는가? :" + result);
		
	}

}
