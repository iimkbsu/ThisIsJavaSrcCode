package ch02.sec03;

public class CharExample {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
		
		char c3 = '가';
		char c4 = 44032;
		//char c5 = ''; 컴파일 에러 (초기화 안 됨)
		//char c6 = ' '; 초기화 가능
		
		/*
		 * 아스키코드 (유니코드)
		 * 48 = '0' ~ 
		 * 57 = '9'
		 * 
		 * 65 = 'A' ~ 
		 * 90 = 'Z'
		 * 
		 * 97 = 'a' ~
		 * 122 = 'z'
		 * */
		
		System.out.printf("%c %c %c %c", c1, c2, c3, c4);

	}

}
