package ch17.sec07.exam02;

import java.util.ArrayList;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		
		List<Student> stdList = new ArrayList<>();
		stdList.add(new Student("홍길동", 30));
		stdList.add(new Student("신용권", 10));
		stdList.add(new Student("신민아", 20));

		// Comparable 인터페이스 구현하지 않은 Student 클래스 객체의 점수를 비교하여 오름차순 정렬하기
		stdList.stream()
		.sorted((std1, std2) -> Integer.compare(std1.getScore(), std2.getScore()))
		.forEach(std -> System.out.println(std.getName() + " : " + std.getScore()));
	
		System.out.println();
		
		// Comparable 인터페이스 구현하지 않은 Student 클래스 객체의 점수를 비교하여 내림차순 정렬하기
		stdList.stream()
		.sorted((std1, std2) -> Integer.compare(std2.getScore(), std1.getScore()))
		.forEach(std -> System.out.println(std.getName() + " : " + std.getScore()));
		
	
	
	}

}
