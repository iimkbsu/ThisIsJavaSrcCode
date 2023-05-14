package ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
	
	public static int sum;

	public static void main(String[] args) {
		
		IntStream rangeStream = IntStream.range(1, 100);
		rangeStream.forEach(num -> sum += num);
		System.out.println("1부터 100미만 숫자의 총합 : " + sum);
		
		
		sum = 0;
		
		IntStream rangeClosedStream = IntStream.rangeClosed(1, 100);
		rangeClosedStream.forEach(num -> sum += num);
		System.out.println("1부터 100포함까지 숫자의 총 합 : " + sum);

	}

}
