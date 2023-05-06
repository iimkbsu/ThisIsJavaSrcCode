package ch15.Quiz.Quiz10;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<Student> myTreeSet = new TreeSet<>();
		myTreeSet.add(new Student("blue", 96));
		myTreeSet.add(new Student("hong", 86));
		myTreeSet.add(new Student("white", 92));
		
		Student myStudent = myTreeSet.last();
		System.out.println("최고점수 : " + myStudent.score);
		System.out.println("최고점수 아이디 :" + myStudent.id);

	}

}
