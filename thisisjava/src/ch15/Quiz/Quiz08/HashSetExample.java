package ch15.Quiz.Quiz08;

import java.util.Set;
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<Student> mySet = new HashSet<>();
		
		mySet.add(new Student(1, "홍길동"));
		mySet.add(new Student(2, "신용권"));
		mySet.add(new Student(1, "조민우"));
		
		
		System.out.println("저장한 객체 수 : " + mySet.size());
		for(Student s : mySet) {
			System.out.println(s.stdNum + " : " + s.stdName);
		}

	}

}
