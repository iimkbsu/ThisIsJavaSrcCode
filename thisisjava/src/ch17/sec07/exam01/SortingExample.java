package ch17.sec07.exam01;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class SortingExample {

	public static void main(String[] args) {
		
		List<Student> stdList = new ArrayList<>();
		
		stdList.add(new Student("홍길동", 30));
		stdList.add(new Student("신용권", 10));
		stdList.add(new Student("유미선", 20));
		
		
		//점수기준 오름차순
		stdList.stream().sorted().forEach(std -> 
		System.out.println(std.getName() + " : " +std.getScore())
		);
		
		System.out.println();
		
		//점수기준 내림차순
		stdList.stream().sorted(Comparator.reverseOrder()).forEach(std ->
		System.out.println(std.getName() + " : " + std.getScore())
				);
	}

}
