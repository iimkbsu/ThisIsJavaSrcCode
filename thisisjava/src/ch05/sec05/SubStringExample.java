package ch05.sec05;

public class SubStringExample {

	public static void main(String[] args) {
		
		String ssn = "01234-56789";
		System.out.println(ssn);
		
		String firstNum = ssn.substring(0, 5);//인덱스 0번부터 5번 전(4번)까지
		String lastNum = ssn.substring(6, 11);//인덱스 6번부터 11번 전(10번)까지
		String lastNum2 = ssn.substring(6); //인덱스 6번부터 끝까지
		
		System.out.println(firstNum);
		System.out.println(lastNum);
		System.out.println(lastNum2);
		

	}

}
