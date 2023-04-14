
//문자열에서 ,(쉼표)로 구분되어 잇는 문자열을 StringTokenizer를 이용하여 분리시키고 출력하기


package ch12.Quiz.Quiz11;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		
		String str = "아이디,이름,패스워드";
		
		StringTokenizer myST = new StringTokenizer(str, ",");
		
		while(myST.hasMoreTokens()) {
			String token = myST.nextToken();
			System.out.print(token + " ");
		}

	}

}
