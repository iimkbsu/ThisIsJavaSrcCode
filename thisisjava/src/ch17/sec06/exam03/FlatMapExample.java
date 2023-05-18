package ch17.sec06.exam03;

import java.util.List;
import java.util.ArrayList;

import java.util.Arrays;

import java.util.stream.*;

public class FlatMapExample {

	public static void main(String[] args) {
		
		//두 개의 문자열이 들어있는 리스트를 스트림으로 갖고오고 공백이 없는 문자열로 요소 변환 후 새 스트림에 넣어 요소 하나씩 출력하기
		List<String> strList = new ArrayList<>();
		strList.add("this is java");
		strList.add("i am the best developer in the world");
		
		strList.stream().flatMap(str -> Arrays.stream(str.split(" "))).forEach(word -> System.out.println(word));
		
		System.out.println();
		
		
		
		//정수 배열을 스트림에 넣은 후 홀수만 새 스트림에 넣은 후 요소 하나씩 출력하기
		int[] intArr1 = new int[] {1,2,3,4,5};
		
		IntStream intStream = Arrays.stream(intArr1);
		intStream.filter(num -> num%2==1).forEach(num -> System.out.println(num));
		
		System.out.println();
		
		
		//한 줄의 문자열을 리스트로 받고 이를 ','로 나눈 후 공백을 지우고 각 문자열을 숫자로 스트림에 저장하여 하나씩 출력하시오
		List<String> list = Arrays.asList("10, 20, 30, 40, 50");
		list.stream().flatMapToInt(str -> {
			String[] strArr = str.split(",");
			int[] intArr = new int[strArr.length];
			for(int i=0; i<intArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr);
		}).forEach(num -> System.out.println(num));
		
		
		
		
		
		
	}

}
