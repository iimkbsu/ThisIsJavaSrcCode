package ch17.sec11;

import java.util.ArrayList;
import java.util.List;

public class ReductonExample {

	public static void main(String[] args) {
		
		List<Student> stdList = new ArrayList<>();
		
		/*
		stdList.add(new Student("홍길동", 92));
		stdList.add(new Student("신용권", 95));
		stdList.add(new Student("김자바", 88));
		*/
		
		// 학생의 총점을 스트림을 통해 구하자, 4가지 방법으로 요소가 없을 때 0으로 저장하여 출력하도록 하자
		
		// sum() 으로 구하기
		int sum1 = stdList.stream().mapToInt(std -> std.getScore()).sum();
		System.out.println("총점 : " + sum1);
		
		
		// reduce(요소 없을 때 리턴 값, (매개변수1, 매개변수2) -> 변수처리) 람다식으로 구하기
		int sum2 = stdList.stream().mapToInt(std -> std.getScore()).reduce(0, (sc1, sc2) -> sc1 + sc2);
		System.out.println("총점 : " + sum2);
		
		
		// reduce((매개변수1, 매개변수2) -> 변수처리) 람다식으로 구하기, 요소 없을 때 예외처리 try catch
		try {
			int sum3 = stdList.stream().mapToInt(Student :: getScore).reduce((sc1, sc2) -> sc1 + sc2).getAsInt();
			System.out.println("총점 : " + sum3);
		}
		catch(Exception e) {
			int sum3 = 0;
			System.out.println("총점 : " + sum3);
		}
		
		
		// reduce((매개변수1, 매개변수2) -> 변수처리) 람다식으로 처리하고 요소값 없을 때 0 나오게 처리
		int sum4 = stdList.stream().mapToInt(Student :: getScore).reduce((sc1, sc2)-> sc1 + sc2).orElse(0);
		System.out.println("총점 : " + sum4);
		
		
	}

}





