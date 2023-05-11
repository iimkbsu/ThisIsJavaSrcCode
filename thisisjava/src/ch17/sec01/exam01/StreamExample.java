package ch17.sec01.exam01;

import java.util.stream.Stream;

import java.util.HashSet;
import java.util.Set;

import java.util.Iterator;

public class StreamExample {

	public static void main(String[] args) {
		
		Set<String> mySet = new HashSet<>();
		mySet.add("홍길동");
		mySet.add("신용권");
		mySet.add("김자바");
		
		// 스트림을 만들어서 내부 반복자로 처리하기
		Stream<String> stream = mySet.stream();
		stream.forEach(name -> System.out.println(name));

	}

}
