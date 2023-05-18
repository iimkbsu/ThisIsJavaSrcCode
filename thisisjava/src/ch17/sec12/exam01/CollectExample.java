package ch17.sec12.exam01;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

import java.util.Map;

import java.util.Set;

public class CollectExample {

	public static void main(String[] args) {
		
		List<Student> stdList = Arrays.asList(
				new Student("홍길동", "남", 92),
				new Student("김수영", "여", 87),
				new Student("김자바", "남", 95),
				new Student("오해영", "여", 93)
				);
		
		// List에서 Set으로 복사 방법1
		Set<Student> mySet = Set.copyOf(stdList); //set -> List도 동일
		
		// List에서 Set으로 복사 방법2
		Set<Student> mySet2 = stdList.stream().collect(Collectors.toSet());
		
		//////////////////////////////////////////////////////////////////////
		
		//남자만 리스트에 넣기 방법1
		List<Student> maleList1 = stdList.stream()
				.filter(std -> std.getSex().equals("남")).collect(Collectors.toList());
				
		maleList1.stream().forEach(male -> System.out.println(male.getName()));
		System.out.println();
		
		//남자만 리스트에 넣기 방법2 (java16이상)
		List<Student> maleList2 = stdList.stream().filter(std -> std.getSex().equals("남")).toList();

		maleList2.stream().forEach(male -> System.out.println(male.getName()));
		System.out.println();
		
		
		//학생 이름을 key 학생 점수를 값으로 갖는 Map 생성
		Map<String, Integer> stdMap = stdList.stream()
				.collect(Collectors.toMap(std -> std.getName(), std -> std.getScore()));
		
		System.out.println(stdMap);
		
	}

}
