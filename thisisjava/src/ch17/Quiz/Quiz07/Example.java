
/*
 
 7. List에 저장된 Member 중 직업이 '개발자'인 사람만 별도의 List에 수집하라
 
 */

package ch17.Quiz.Quiz07;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

	public static void main(String[] args) {
		
		List<Member> myList = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자")
				);
		
		List<Member> devList = myList.stream().filter(mem -> mem.getJob().equals("개발자")).collect(Collectors.toList());
		
		devList.forEach(mem -> System.out.println(mem.getName()));
		
	}

}
