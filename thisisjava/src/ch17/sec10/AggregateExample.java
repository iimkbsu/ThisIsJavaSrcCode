package ch17.sec10;

import java.util.Arrays;

public class AggregateExample {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		
		System.out.print("배열 : ");
		for(int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();

		
		//count()
		long count = Arrays.stream(arr).count();
		System.out.println("배열 요소 개수 : " + count);
		
		
		//filter() + count()
		long countEven = Arrays.stream(arr).filter(num -> num%2==0).count();
		System.out.println("배열에서 짝수 요소 개수 : " + countEven);
		
		
		//sum()
		int sum = Arrays.stream(arr).sum();
		System.out.println("배열 요소 총합 : " + sum);
		
		
		//filter() + sum()
		double sumEven = Arrays.stream(arr).filter(num -> num%2==0).sum();
		System.out.println("배열에서 짝소 요소 총합을 double로 : " + sumEven);
		
		
		//average()
		double avg = Arrays.stream(arr).average().getAsDouble();
		System.out.println("배열 요소 평균 : " + avg);
		
		//filter() + average()
		double avgEven = Arrays.stream(arr).filter(num -> num%2==0).average().getAsDouble();
		System.out.println("배열 짝수 요소 평균 : " + avgEven);
		
		
		//max()
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println("배열 요소 중 최대 값 : " + max);
		
		
		//filter() + max()
		double maxEven = Arrays.stream(arr).filter(num -> num%2==0).max().getAsInt();
		System.out.println("배열 짝수 요소 중 최대 값을 double로 " + maxEven);
		
		
		//min()
		System.out.println("배열 요소 중 최소 값 : " + Arrays.stream(arr).min().getAsInt());
		
		//filter() + min()
		System.out.println("배열 짝수 요소 중 최소 값 : " + Arrays.stream(arr).filter(num -> num%2==0).min().getAsInt());
		
		
		//findFirst()
		int first = Arrays.stream(arr).findFirst().getAsInt();
		System.out.println("배열 요소 중 처음 값 : " + first);
		
		//filter() + findFirst()
		int firstEven = Arrays.stream(arr).filter(num -> num%2==0).findFirst().getAsInt();
		System.out.println("배열 짝수 요소 중 처음 값 : " + firstEven);
		
	}

}








