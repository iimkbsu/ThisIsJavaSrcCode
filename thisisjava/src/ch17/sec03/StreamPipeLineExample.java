package ch17.sec03;

import java.util.Arrays;
import java.util.List;

import java.util.ArrayList;

import java.util.stream.*;


//학생의 점수만 받아서 평균 출력하기
public class StreamPipeLineExample {

	public static void main(String[] args) {
	
		// 정석적인 방법
		List<Student> myStdList = new ArrayList<>();
		myStdList.add(new Student("홍길동", 10));
		myStdList.add(new Student("신용권", 20));
		myStdList.add(new Student("김자바", 30));
		
		Stream<Student> myStdStream = myStdList.stream();
		
		IntStream myStdScoreStream = myStdStream.mapToInt((Student std)->{return std.getScore();});
		
		double avgScore = myStdScoreStream.average().getAsDouble();
		System.out.println("평균 점수 : " + avgScore);
		
		
		
		// 방법 2
		List<Student> myStdList2 = Arrays.asList(
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("김자바", 30)
				);
		
		Stream<Student> myStdStream2 = myStdList2.stream();
		
		IntStream myStdScoreStream2 = myStdStream2.mapToInt(std -> std.getScore());
		
		double avgScore2 = myStdScoreStream2.average().getAsDouble();
		System.out.println("평균 점수 : " + avgScore2);
		
		
		
		
		// 방법 3
		List<Student> myStdList_unmodif = List.of(
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("김자바", 30)
				);
		
		
		Stream<Student> myStdStream_u = myStdList_unmodif.stream();
		
		IntStream myStdScoreStream_u = myStdStream_u.mapToInt(std -> std.getScore());
		
		double avgScore_u = myStdScoreStream_u.average().getAsDouble();
		System.out.println("평균 점수 : " + avgScore_u);
		
		
		
		
		//방법 4. 초간단버전
		List<Student> myStdList3 = Arrays.asList(
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("김자바", 30)
				);
		
		double avgScore3 = myStdList3.stream().mapToInt(Student :: getScore).average().getAsDouble();
		System.out.println("평균 점수 : " + avgScore3);
		
		
		
		System.out.println();
		
		
		//학생의 이름만 출력해보자
		myStdList.stream().map(Student :: getName).forEach(name -> System.out.print(name + " "));
	}
	

}
