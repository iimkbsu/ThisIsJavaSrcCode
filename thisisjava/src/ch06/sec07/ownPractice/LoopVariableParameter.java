package ch06.sec07.ownPractice;

import java.util.Arrays;

public class LoopVariableParameter {

	static int sum(int...values) {
		int result = 0;
		
		for(int i=0; i<values.length; i++) {
			result +=values[i];
		}
		
		return result;
	}
	/*
	 배열을 문자열로 변환하는 방법
		Arrays.toString( )
		
	char 배열을 문자열로 변환하는 방법
		String.valueOf( )
		new String( )
		
	문자열을 char로 변환하는 방법
		.toCharArray( )
	 
	 */
	
	//가변길이 매개변수 char을 받아 이를 거꾸로 하여 String 형으로 출력하는 메소드
	static String string(char...values) {
		String result = null;
		String result2 = null;
		char[] chr = new char[values.length];
		
		//for문 증감식 동시에 (길이는 서로 같아야 함)
		for(int i=values.length-1, a = 0; i>=0 && a<values.length; i--, a++) {
			chr[a] = values[i];
		}
		
		result = Arrays.toString(chr);
		result2 = String.valueOf(chr);
		return result2;
	}
	
	public static void main(String[] args) {
		
		int a = sum(1,2,3);
		System.out.println(a);
		
		String b = string('e','m',' ','l', 'l', 'a', 'c');
		System.out.println(b);
		

	}

}
