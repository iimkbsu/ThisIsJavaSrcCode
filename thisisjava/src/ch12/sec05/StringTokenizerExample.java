
/*
 
 
 String의 split() 메소드
 	- 정규 표현식으로 구분하여 쪼갬
 	- 단일 구분자, 다수 구분자를 정규표현식으로 받아서 자를 수 있음
 
 예. 
 String str = "홍길동&이수홍, 박연수, 김자바-최명호";
 String[] names = str.split("&|,|-");
 
/////////////////////////////////////////////////////////// 
 
 
 
 StringTokenizer(문자열, ["구분자"])
 	- String을 token(문자)으로 쪼개서 사용하기 위한 클래스
 	- import 필요
 	- 구분자 없을경우에는 공백으로 구분함
 	- 단일 구분자일 경우에 사용
 
  
 StringTokenizer(문자열 ,[""]) 클래스의 메소드 종류
 	- countTokens()			- 토크나이저에 남아있는 분리 가능한 문자열 개수 리턴 (int)
 	- hasMoreTokens()		- 남아 있는 토큰(문자열) 존재 여부 리턴 (t/f)
 	- nextToken()			- 문자열(토큰) 차례대로 하나씩 빼서 리턴 (String) -> countTokens() 리턴값이 줄어듦
 	
 	
 
 예.
 String str1 = "홍길동/이수홍/박연수/김자바/최명호";
 StringTokenizer = new StringTokenizer(str1, "/");
 

 
 
 
 */



package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		
		String str1 = "가나다 라마바 아자차 카타파 하";
		String str2 = "ABC DEF/GHI#JKL";
		
		
		//StringTokenizer, while(.hasMoreTokens()) 사용
		StringTokenizer st = new StringTokenizer(str1); //기본값인 공백으로 토큰 구분
		
		//StringTokenizer에 남아있는 token(문자열)이 있을 경우 반복 작동
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println();
		
		
		
		
		
		//StringTokenizer, for() 사용
		StringTokenizer st2 = new StringTokenizer(str1);
		//nextToken() 메소드 실행 시 token 개수가 줄어 countTokens() 리턴값이 줄어들기 때문에 초기값을 int형 변수에 넣어서 for문에 사용
		int counts = st2.countTokens(); 
		
		for(int i=0; i<counts; i++) {
			System.out.println(st2.nextToken());
		}
		System.out.println();
		
		
		
		
		
		
		//String[], split(정규표현식) 사용
		String[] sArray = str1.split(" ");
		for(String s : sArray) {
			System.out.println(s);
		}
		System.out.println();
		
		//String[], split(정규표현식) 사용
		String[] sArray2 = str2.split(" |/|#");
		for(String s : sArray2) {
			System.out.println(s);
		}

	}

}



