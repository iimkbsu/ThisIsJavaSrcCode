
/*
 
 정규표현식(RegExp)
 	- 프로그래밍 언어의 문자열을 다룰 때 특정한 규칙을 가진 문자열로 표현하기 위한 규칙
 	- 임의 input 문자열이 규칙대로 구성되어있는지 확인하기 위한 검증 식
 	
 	- JS,TS,루비 등 에서는 기본 문법으로 제공
 	- java, 파이썬, C++ 등 에서는 클래스(라이브러리)형식으로 제공
 	
 
 표현방법
	\			이스케이핑(escaping)
	\d			일치. 한 개의 숫자			== [0-9]
	\s			공백
	\w			일치. 한 개의 숫자 또는 문자	== [0-9_a-zA-Z]
	\.			.(점)
	
	^			범위. 시작 지점
	$			범위. 끝나는 지점
	
 	*			수량. 없거나 하나 이상 		== {0,}
	+			수량. 하나 이상 			== {1,}
	?			수량. 없거나 하나이다.
	
	.			일치. 모든 문자 중 하나와 일치
	(x)			일치. x와 일치하는 것을 찾은 후에 접근 (묶을 때 사용)
	x|y			일치. x또는 y
	
	{n}			수량. 딱 n개
	{n,}		수량. 최소 n개
	{n,m}		수량. n개부터 m개까지
	
	t{n}		수량. t와 n번 일치하는 문자열
	t{n,}		수량. t와 n번 이상 일치하는 문자열
	t{n,m}		수량. t와 n번 이상 m번 이하로 일치하는 문자열
	
	[xyz]		일치. xyz중에 하나라도 일치하는 문자
	[^xyz]		일치. xyz이외의 하나와 일치하는 문자
	[a-zA-z]	일치. a~z,A~Z중 하나라도 일치하는 문자
	
	
	예. 
	
	010-1234-4567 이나 02-122-1212 와 같은 전화번호 형식을 위한 정규표현식
	
	{02|010}-\d{3,4}-\d{4}
	
	
	
	programmer@program.net 이나 engineer@factory.com  또는 aas@yahoo.co.kr 과 같은 이메일 형식을 위한 정규표현식
	
	\w{1,}@\w{1,}(\.\w{1,})?
	
	\w+@\w+(\.\w+)?
	
	
	
java에서의 정규표현식 검증

	- java.util.regex 패키지의 Pattern 클래스에서 제공하는 matches() 메소드 사용
	
	- matches("정규식", "검증문자열") (true/false 리턴)
	
	
	
	
	
 */




package ch12.sec10;

//Pattern은 생성자가 없는 final 클래스이고 static 메소드 matches("","")를 제공
import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		
		String PNRegExp = "^(02|010)-\\d{3,4}-\\d{4}$";
		
		String PNData1 = "010-1234-4567";
		String PNData2 = "02-121-2223";
		
		boolean PNResult1 = Pattern.matches(PNRegExp, PNData1);
		boolean PNResult2 = Pattern.matches(PNRegExp, PNData2);
		
		if(PNResult1 && PNResult2) {
			System.out.println("전화번호는 정규식과 일치합니다.");
		}else {
			System.out.println("전화번호는 정규식과 일치하지 않습니다.");
		}
		System.out.println();
		
		
		String EMRegExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?"; 
		
		String[] EMData = {"www.naver.com", "eee@naver.com", "fff@yahoo.co.kr", "ggg@facebookcom"};
		
		boolean[] EMResult = new boolean[EMData.length];
		
		
		for(int i=0; i<4; i++) {
			
			EMResult[i] = Pattern.matches(EMRegExp, EMData[i]);
			
			if(EMResult[i]) {
				System.out.println((i+1)+"번 째 메일은 정규식과 일치합니다.");
			}else {
				System.out.println((i+1)+"번 째 메일은 정규식과 불일치합니다.");
			}
			
		}

	}

}







