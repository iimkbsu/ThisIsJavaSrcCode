
/*
 
 6. List에 저장되어 있는 Member의 평균 나이를 출력하라
 
 */

package ch17.Quiz.Quiz06;

import java.util.List;
import java.util.ArrayList;

public class Example {

	public static void main(String[] args) {
		
		List<Member> myList = new ArrayList<>();
		
		myList.add(new Member("홍길동", 30));
		myList.add(new Member("신용권", 40));
		myList.add(new Member("김자바", 26));
		
		
		double avg = myList.stream().mapToInt(mem -> mem.getAge()).average().getAsDouble();

		System.out.println("리스트에 있는 멤버들의 나이 평균 : " + avg);
	}

}
