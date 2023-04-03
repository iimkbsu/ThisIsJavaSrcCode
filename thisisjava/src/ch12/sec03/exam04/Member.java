
/*
 
 record :
 클래스간 객체를 넘길 때 데이터도 같이 넘어가는 경우가 많은데(id, 이름, 나이 등) 
 이런 DTO(데이터전송객체)를 작성할 때 반복적으로 써줘야 하는 코드를 줄이는 기술로 record를 만들어서 사용
 
 */

package ch12.sec03.exam04;

//레코드 클래스
public record Member(String id, String name, int age) {

	/*
	 
	 java 14부터 레코드 사용가능
	 
	 아무 내용도 없지만 레코드 클래스로 선언하면 자동적으로
	 private 필드, 
	 getter(), 
	 재정의 된 hashCode(), 
	 재정의 된 equals(), 
	 재정의 된 toString() 자동으로 생성됨
	 
	 */
	
	
	
}
