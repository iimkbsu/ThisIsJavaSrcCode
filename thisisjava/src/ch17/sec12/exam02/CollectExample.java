package ch17.sec12.exam02;

import ch17.sec12.exam01.Student;
import java.util.List;
import java.util.Arrays;

import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {

	public static void main(String[] args) {
		
		List<Student> stdList = Arrays.asList(
				new Student("홍길동", "남", 92),
				new Student("김수영", "여", 87),
				new Student("김자바", "남", 95),
				new Student("오해영", "여", 93)
				);

		Map<String, List<Student>> stdMap = stdList.stream().collect(Collectors.groupingBy(std -> std.getSex()));
		
		List<Student> maleList = stdMap.get("남");			// 맵컬렉션.get(키)  리턴 값
		List<Student> femaleList = stdMap.get("여");
		
		// 컬렉션.forEach() vs 컬렉션.스트림.forEach()
		// 차이는 스트림 객체 생성 유무, 결과는 동일
		
		maleList.forEach(std -> System.out.println(std.getName()));
		System.out.println();
		maleList.stream().forEach(std -> System.out.println(std.getName()));
		
		System.out.println();
		
		femaleList.forEach(std -> System.out.println(std.getName()));
		System.out.println();
		femaleList.stream().forEach(std -> System.out.println(std.getName()));

		
		
	}
}






