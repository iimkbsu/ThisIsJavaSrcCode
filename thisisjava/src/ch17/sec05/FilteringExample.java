package ch17.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
	
	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>();
		
		myList.add("홍길동"); myList.add("신용권");
		myList.add("김자바"); myList.add("신용권"); 
		myList.add("신민철");

		
		//스트림에서 중복 제거하고 출력하기
		myList.stream().distinct().forEach(name -> System.out.print(name + " "));
		System.out.println();
		
		
		
		//스트림에서 '신'씨만 필터링하여 출력하기
		myList.stream().filter(n -> n.startsWith("신")).forEach(name -> System.out.print(name + " "));
		System.out.println();
		
		//스트림에서 중복 제거하고 '신'씨만 필터링 해서 출력하기
		myList.stream().distinct().filter(nae -> nae.startsWith("신")).forEach(name -> System.out.print(name + " "));
	
	
	
	}

}
