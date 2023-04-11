
/*
 
 java.text.DecimalFormat 클래스
 	- Decimal : 십진법
 	- new 연산자로 객체 생성 후 객체 매개변수로 "기호패턴 문자열" 사용
 		
 		공란					: 세자리 마다 "," 표기
 		"0" 				: 10진수 표기, 빈자리 0으로 채움
 		"#" 				: 10진수 표기, 빈자리 채우지 않음
 		"." 				: 소수점
 		"+ 또는 -" 			: 양수 음수 기호
 		"E"					: 지수문자 (예, 1.2E4 : 1.2*10^4)
 		";"					: 양수일 때 음수일 때 모두 표기하고 싶을 때 패턴 구분자
 		"%"					: % 표기
 		"\u00A4				: 통화기호 ￦
 	
 
  */




package ch12.sec09;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		
		double num = 1234567.89;
		
		DecimalFormat df;
		df = new DecimalFormat();
		System.out.println(df.format(num));
		
		df = new DecimalFormat(".0000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+###,###.###");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("###,###.0000 %");
		System.out.println(df.format(num));

	}

}
