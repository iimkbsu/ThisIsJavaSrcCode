package ch02.sec06;

public class StringExample {

	public static void main(String[] args) {
		String name = "홍길동", job = "프로그래머";
		System.out.println("이름 = " + name);
		System.out.println("직업 = " + job);

		String str = "나는 \"자바\"를 배웁니다.";
		System.out.println(str);
		
		str = "번호\t이름\t직업";
		System.out.println(str);
		System.out.printf(str + "\n");
		
		System.out.print("나는\n");
		System.out.println("자바를");
		System.out.printf("배웁니다\n");
		System.out.printf("오케이\n");
	}
	
	/*
	 print : 괄호안 내용을 단순히 출력. 개행문자(=줄바꿈문자=\n) 포함 안 됨.

	printf : C에서의 printf와 동일. %d, %s 등을 쓰기위해 사용. 개행문자 포함X

	println : 괄호안 내용을 출력한 후 마지막에 개행문자가 포함되어 있어 출력후 한 줄 띄워짐.
	 * */

}
