package ch17.sec04.exam02;

import java.util.stream.*;

import java.util.Arrays;


public class StreamExample {

	public static void main(String[] args) {
		
		String[] strArr = {"홍길동", "신용권", "김미나"};
		
		Stream<String> strStream = Arrays.stream(strArr);
		
		strStream.forEach(str -> System.out.print(str + " "));
		System.out.println();
		
		
		int[] intArr = {1,2,3,4,5};
		
		IntStream intStream = Arrays.stream(intArr);
		intStream.forEach(intt -> System.out.print(intt + " "));
		

	}

}
