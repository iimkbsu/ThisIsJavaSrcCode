
/*
 
 <java API 다큐먼트>
 https://docs.oracle.com/en/java/javase/
 
 
 API(Application Programming Interface)
 	- 앱을 프로그래밍 할 때 서로 연결하여 상호작용 할 수 있도록 기능 및 데이터를 제공하는 매개체
 	- 기본 제공 API와 사용자 배포 API가 있음
 
 java.base 모듈
 	- 모든 모듈이 의존하는 모듈, 유일하게 requires 하지 않고 사용가능
 	- 모듈에 속하는 주요 패키지
 		- java.lang (자바 언어 기본 클래스 제공, 유일하게 import없이 사용가능)
 		- java.util (자료구조 관련 컬렉션 클래스 제공)
 		- java.text (날짜, 숫자를 원하는 형태 문자열로 만들어 주는 포맷 클래스 제공)
 		- java.time (날짜, 시간을 조작 및 연산하는 클래스 제공)
 		- java.io (입출력 스트림 클래스 제공)
 		- java.net (네트워크 통신 관련 클래스 제공)
 		- java.nio (데이터 저장 buffer 및 새로운 입출력 클래스 제공)
 		
 		
 Object 클래스
 	- 모든 자바 클래스는 Object 클래스를 상속받음 (extends 없을경우 java.lang.object 상속받게 됨)
 	- 주요 메소드
 		- boolean equ민(Object obj)
 		- int hashCode()
 		- String toString()
 
 */


package ch12.sec03.exam01;

public class Member {
	
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	
	//equal()를 내용비교하기로 사용하기위해 재정의 하자
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member mem) {
			if(id.equals(mem.id)) {
				return true;
			}
		}
		
		return false;
	}

}







