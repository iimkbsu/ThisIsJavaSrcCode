package ch17.sec10;

import java.util.ArrayList;
import java.util.List;

import java.util.OptionalDouble;

public class OptionalExample {

	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
		
		/*
		myList.add(1);
		myList.add(111);
		myList.add(12);
		myList.add(15);
		myList.add(231);
		*/

		
		OptionalDouble od = myList.stream().mapToInt(obj -> obj.intValue()).average();
		
		
		// 요소가 없는 list를 스트림으로 만들어 최종처리 할 때
		
		
		/*
		// NSEE 예외 발생
		if(od.getAsDouble() != 0) {
			System.out.println("평균 : " + od.getAsDouble());
		}else {
			System.out.println("평균 : 0.0");
		}
		*/
		
		
		
		//방법1
		if(od.isEmpty()) {
			System.out.println("방법1 평균 : 0.0" );
		}else {
			System.out.println("방법1 평균 :" + od.getAsDouble());
		}
		
		//방법1.1
		if(od.isPresent()) {
			System.out.println("방법1.1 평균 : " + od.getAsDouble());
		}else System.out.println("방법1.1 평균 : 0.0");
		
		
		//방법2
		double avg = myList.stream().mapToInt(num -> num.intValue()).average()
				.orElse(0.0);
		System.out.println("방법2 평균 : " + avg);
		
		
		
		//방법3
		myList.stream().mapToInt(Integer :: intValue).average().ifPresent(a -> System.out.println("방법3 평균 :" + a));
		
		
		
	}

}
