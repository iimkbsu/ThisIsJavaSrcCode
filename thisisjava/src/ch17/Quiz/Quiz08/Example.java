
/*
 	8. List에 저장되어있는 Member를 직업별로 분류하고 Map<String, List<Member>> 객체로 생성하라
 		조건. 
 		Key는 Member의 직업
 		값은 해당 직업 갖는 Member의 List
 
 */

package ch17.Quiz.Quiz08;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {

	public static void main(String[] args) {
		
		List<Member> myList = new ArrayList<>();
		
		myList.add(new Member("홍길동", "개발자"));
		myList.add(new Member("김나리", "디자이너"));
		myList.add(new Member("신용권", "개발자"));
		
		Map<String, List<Member>> myMap = myList.stream().collect(Collectors.groupingBy(Member :: getJob));
		
		System.out.println("[개발자]");
		myMap.get("개발자").stream().forEach(mem -> System.out.println(mem.toString()));
		
		System.out.println();
		
		System.out.println("[디자이너]");
		myMap.get("디자이너").stream().forEach(mem -> System.out.println(mem.toString()));
		
	}

}




