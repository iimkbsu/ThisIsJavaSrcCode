
//1~100까지 숫자를 통 문자열로 바꾸는 코드인데 += 연산자를 이용해 100번 반복 -> 100개 이상의 String 객체 생성 결과
// StringBuilder를 통해 리팩토링 하세요

package ch12.Quiz.Quiz10;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		/*원래코드
		String str = "";
		for(int i=1; i<=100; i++) {
			str += i;
		}
		System.out.println(str);
		*/
		
		
		//StringBuilder 사용
		String str = "";
		StringBuilder mySB = new StringBuilder();
		
		for(int i=1; i<=100; i++) {
			mySB.append(i);
		}
		
		str = mySB.toString();
		System.out.println(str);
		
		

	}

}
