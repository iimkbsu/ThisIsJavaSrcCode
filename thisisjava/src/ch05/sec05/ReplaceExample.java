package ch05.sec05;

import java.util.Scanner;

public class ReplaceExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열 입력 (자바는 영어로 자동변환) : ");
		// 자바.자바.자바 입력해보기
		String str = scanner.nextLine();
		
		
		//replace()는 마침표나 느낌표 같은 특수문자도 정상적으로 변환됨
		String newStr = str.replace("자바", "JAVA");
		System.out.println(newStr);
		
		String newStr2 = str.replace(".", "/");
		System.out.println(newStr2);
		
		
		//replaceAll은 정규표현식을 포함하여 변환시키므로 
		//예를들어 .(마침표)같은경우 정규식으로 모든 문자를 가리키므로 모든문자가 변환됨
		String newStr1 = str.replaceAll("자바", "JAVA"); 
		System.out.println(newStr1);
		
		String newStr3 = str.replaceAll("." , "/");
		System.out.println(newStr3);


	}

}
