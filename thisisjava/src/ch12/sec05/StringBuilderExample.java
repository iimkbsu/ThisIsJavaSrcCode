
/*
 StringBuilder
 	- 문자열 조작 가능. 문자열 길이도 조정 가능 (String은 초기화 하면 길이 조정 불가), import 필요 없음
 
 장점
 	- String 처럼 객체를 새로 생성하지 않고도 버퍼를 사용하여 String 조작이 가능
 	
 StringBuilder 클래스의 메소드 종류
 	- append("추가문자열") 						: 기존 문자열 뒤에 "추가문자열" 추가
 	- insert(인덱스, "삽입문자열") 				: 지정된 인덱스에 "삽입문자열" 삽입
 	- delete(시작인덱스, 끝인덱스) 				: 시작~끝 전 인덱스까지 삭제
 	- replace(시작인덱스, 끝인덱스, "교체문자열") 	: 시작~끝 전 인덱스까지 "교체문자열"로 교체
 	등등
 	
 
 
 메소드 체이닝 패턴
 	- StringBuilder 타입으로 객체 생성하면 나중에 결국 String 타입에 저장하여 String으로 사용해야 하는데
 	- 이를 메소드 체이닝 패턴을 사용하여 처음부터 String 타입으로 StringBuilder 객체를 만들고 메소드를 간편하게 사용한 후 마지막에 .toString()으로 마무리
  
  
  
  String 클래스 메소드 종류
  	- str.charAt(인덱스) 									: 인덱스 문자 리턴
  	- str.replace("포함문자열", "바꿀문자열") 					: 문자열 교체
  	- str.length(); 									: 문자열 길이 리턴	(참고로 배열은 배열.length 임)
  	- str.substring(시작인덱스, [끝인덱스]) 					: 시작부터 끝 인덱스 전까지 잘라서 리턴 (없으면 끝까지)
  	- str.indexOf("찾을문자열") 							: 기존 문자열에서 "찾을문자열"을 찾아 처음 인덱스 리턴
  	- str.split(" ") 									: " "로 문자열 자르고 String[]에 리턴
  	등등
  	
  	
 */

package ch12.sec05;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("ABC");
		sb.insert(3, " DEF");
		sb.append(" ghi");
		System.out.println("StringBuilder : " + sb);
		
		sb.replace(8,11,"GHI"); //8번 인덱스부터 10번인덱스까지 교체
		System.out.println("StringBuilder : " + sb);
		sb.append(" XYZ");
		System.out.println("StringBuilder : " + sb);
		sb.delete(12, 15);
		System.out.println("StringBuilder : " + sb);
		
		//StringBuilder 타입을 String 타입 객체로 저장
		String str = sb.toString();
		System.out.println("String : " + str);
		System.out.println();
		
		
		//메소드 체이닝 패턴을 사용하여 좀 더 간편하게 위의 코드를 리팩토링 하기
		//String 타입으로 StringBuilder 객체를 만들었으므로 메소드 처리를 다 한 후 반드시 .toString()으로 문자열로 리턴해줘야 마무리 됨
		String str2 = new StringBuilder()
				.append("가나다")
				.insert(3," 라마바")
				.append(" 소오조")
				.replace(8,11,"사아자 차카")
				.delete(12, 14)
				.toString();
		
		System.out.println(str2);


	}

}




