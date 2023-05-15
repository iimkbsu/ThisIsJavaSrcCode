package ch17.sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;


public class MapExample {

	public static void main(String[] args) {
		
		int[] intArray = new int[] {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArray);
		
		
		//포장클래스타입 그대로
		intStream.boxed().forEach(a -> System.out.print(a + " "));
		System.out.println();
		
		//-----------------------------
		//포장클래스타입 확인 Integer
		IntStream intStream1 = IntStream.of(intArray);

		intStream1.filter(a -> a == 1).boxed().forEach(a -> System.out.print(a.getClass().getName()));
		System.out.println();
		
		//-----------------------------------
		//intValue로 포장클래스 타입에서 정수타입으로
		IntStream.of(intArray).boxed().forEach(a -> System.out.print(a.intValue() + " "));
		System.out.println();
		
		
		
		Arrays.stream(intArray).asLongStream().forEach(a -> System.out.print(a + " "));
		System.out.println();
		
		
		Arrays.stream(intArray).asDoubleStream().forEach(a -> System.out.print(a + " "));
	}

}
