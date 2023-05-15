package ch17.sec06.exam01;

import java.util.List;
import java.util.ArrayList;

import java.util.stream.IntStream;

public class MapExample {

	public static void main(String[] args) {
		
		List<Student> stdList = new ArrayList<>();
		
		stdList.add(new Student ("홍길동", 85));
		stdList.add(new Student ("홍길동", 92));
		stdList.add(new Student ("홍길동", 87));
		
		//방법1
		IntStream scoreStream = stdList.stream().mapToInt(std -> std.getScore());
		scoreStream.forEach(score -> System.out.println(score));
		System.out.println();
		
		//방법2
		stdList.stream().mapToInt(std -> std.getScore()).forEach(score -> System.out.println(score));

		
		
	}

}
