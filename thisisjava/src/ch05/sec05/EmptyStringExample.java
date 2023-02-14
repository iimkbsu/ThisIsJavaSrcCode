package ch05.sec05;

public class EmptyStringExample {

	public static void main(String[] args) {
		
		String hobby =""; //빈 문자열과 null은 다름
		if(hobby.equals("")) {
			System.out.println("hobby 변수가 참조는 String, 객체는 빈 문자열");
		}

	}

}
