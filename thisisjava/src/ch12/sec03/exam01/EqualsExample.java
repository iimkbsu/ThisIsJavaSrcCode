
/*
 
 Object 클래스 제공 equals() 메소드
  - 참조 주소 비교 (true/false) ( == 와 같은 기능)
 
 String 클래스의 equals() 메소드는 재정의 매소드(Overriding)
 	- 내용 비교 (true/false)
 
 
 String 클래스의 equals() 처럼 보통 내용을 비교하기 위해 매소드를 재정의 하여 사용한다
 
 */


package ch12.sec03.exam01;

public class EqualsExample {

	public static void main(String[] args) {
		
		//서로 참조 주소가 다른 객체
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		//서로 참조 주소가 다른 문자열
		String str1 = new String("aaa");
		String str2 = "aaa";
		
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));//Object의 equals()를 내가 재정의 함
		System.out.println(obj2.equals(obj3));
		
		System.out.println();
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));//String 클래스에서 재정의 되어 있는 equals()
		
		
		

	}

}
