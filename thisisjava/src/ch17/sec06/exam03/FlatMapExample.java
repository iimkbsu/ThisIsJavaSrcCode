package ch17.sec06.exam03;

import java.util.List;
import java.util.ArrayList;

import java.util.Arrays;

import java.util.stream.*;

public class FlatMapExample {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<>();
		
		strList.add("this is java");
		strList.add("i am a best developer in the universe");
		
		strList.stream().forEach(sentence -> System.out.println(sentence));
		
		System.out.println();
		
		
		strList.stream().flatMap(sentence -> Arrays.stream(sentence.split(" "))).forEach(word -> System.out.print(word));;

		System.out.println();
		
		
		
		List<String> list = Arrays.asList("1,2,3,4,5");
		
		list.stream().flatMap(num -> Arrays.stream(num.split(","))).forEach(num -> System.out.println(num));
		
		System.out.println();
		
		
		list.stream().flatMapToInt(num -> {
			String[] strArr = num.split(",");
			int[] intArr = new int[strArr.length];
			for(int i=0; i<intArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr);
		}).forEach(numb -> System.out.println(numb));
		
	}

}
