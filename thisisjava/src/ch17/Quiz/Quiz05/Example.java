
/*
 
 5. List에 저장된 String 요소에서 대소문자와 상관없이 'java'라는 단어 포함된 문자열만 필터링하여 출력하기
 
 */


package ch17.Quiz.Quiz05;

import java.util.Arrays;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		
		List<String> myList = Arrays.asList(
				"This is a java book",
				"Lambda Expression",
				"Java8 supports lambda expression"
				);
		
		myList.stream().filter(str -> str.toLowerCase().contains("java")).forEach(str -> System.out.println(str));;

	}

}
