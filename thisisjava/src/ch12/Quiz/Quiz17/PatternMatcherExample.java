
/*
 
 정규표현식을 이용해 첫 번째는 알파벳으로 시작, 두 번째부터 숫자와 알파벳으로 구성된 총 8~12자 사이의 ID 값 검사. 알파벳은 대소문자 모두 사용 가능
 
 */

package ch12.Quiz.Quiz17;

import java.util.regex.Pattern;

public class PatternMatcherExample {

	public static void main(String[] args) {
		
		String id = "5Angle1004";
		
		//작성코드
		String regExp = "[a-zA-Z][0-9_a-zA-Z]{7,11}";
		//작성코드
		boolean isMatch = Pattern.matches(regExp, id);
		
		if(isMatch) {
			System.out.println("ID로 사용할 수 있습니다");
		}else {
			System.out.println("ID로 사용할 수 없습니다");
		}

	}

}
