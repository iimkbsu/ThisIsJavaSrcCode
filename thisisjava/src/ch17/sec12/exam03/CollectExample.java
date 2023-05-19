package ch17.sec12.exam03;

import java.util.Arrays;

import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

import ch17.sec12.exam01.Student;


public class CollectExample {
	

	public static void main(String[] args) {
		
		List<Student> stdList = Arrays.asList(
				new Student("홍길동", "남", 92),
				new Student("김수영", "여", 87),
				new Student("김자바", "남", 95),
				new Student("오해영", "여", 93)
				);

		//남,여 그룹지어 그룹 점수 평균을 구해서 출력하라
		Map<String, Double> stdMap = stdList.stream().collect(Collectors.groupingBy(Student :: getSex, Collectors.averagingDouble(Student :: getScore)));
		System.out.println(stdMap + "\n");
		
		
		//요소 수
		Map<String, Long> stdMap2 = stdList.stream().collect(Collectors.groupingBy(std -> std.getSex(), Collectors.counting()));
		System.out.println(stdMap2+ "\n");
		
		
		
	}

}
