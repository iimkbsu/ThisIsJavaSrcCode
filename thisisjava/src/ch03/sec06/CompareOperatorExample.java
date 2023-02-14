package ch03.sec06;

public class CompareOperatorExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2); //true
		boolean result2 = (num1 != num2); //false
		boolean result3 = (num1 <= num2); //true
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2); //true
		System.out.println(result4);
		
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 == num4);//true
		System.out.println(result5);
		
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result6 = (num5 == num6); //false
		boolean result7 = (num5 == (float)num6); //true
		System.out.println(result6);
		System.out.println(result7);
		
		
		//문자열끼리 비교는 비교연산자 쓰지 않고 
		//비교문자열.equals(비교문자열) -> 같으면 true 다르면 false
		//! 비교문자열.equals(비교문자열)
		
		String str1 = "자바";
		String str2 = "Java";
		boolean result8 = (str1.equals(str2)); //false
		boolean result9 = (! str1.equals(str2)); //true
		System.out.println(result8);
		System.out.println(result9);
		
	}

}
