
/*
 포장 값 비교
 	- 객체의 값 자체 비교 : equals()
 	- 객체 참조 비교 : ==, !=
 	
 	- 객체 생성 없는 값 자체비교 : ==, !=
 	
 	
 참고
 	- 포장 값이 일정 범위 안에 있으면 같은 객체 참조하므로 equals() 메소드도 true를 반환함
 
 
 같은 객체 참조 범위
 	- boolean (true, false)
 	- char (\u0000 ~ \u0071)
 	- int, byte, short (-128 ~ 127)
 
 */


package ch12.sec06;

public class ValueCompareExample {

	public static void main(String[] args) {
		
		int a = 10;
		
		Integer a1 = 10;
		Integer a2 = 10; //a1과 주소공유

		Integer a3 = new Integer(10); //version 9 부터 안 씀
		
		//a가 int 타입이므로 ==연산자는 값 자체 비교가 됨
		boolean tf1 = (a == a1);
		System.out.println(tf1);
		
		//참조 주소 비교
		boolean tf2 = (a1 == a2);
		System.out.println(tf2);
		
		//참조 주소 비교
		boolean tf3 = (a2 == a3);
		System.out.println(tf3);
		
		System.out.println();
		
		//객체의 값 자체 비교
		System.out.println(a1.equals(a2));
		System.out.println(a2.equals(a3));
		System.out.println();
		
		
		//같은 객체 참조 범위가 넘어간 경우 (자동 Boxing 시 다른 객체가 생성 됨)
		Integer rangeOut1 = 128;
		Integer rangeOut2 = 128;
		
		System.out.println(rangeOut1 == rangeOut2); //false
		System.out.println(rangeOut1.equals(rangeOut2)); //true
		
		
		
		

	}

}
