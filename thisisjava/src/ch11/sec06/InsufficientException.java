
/*
 사용자 정의 예외
 
 Throwable 예외 클래스에 있는 일반예외, 실행예외만으로는 예외처리가 불충분 하므로
 개발자가 임의 예외처리를 만들어서 사용하는 경우가 매우 많음
 
 일반예외는 Exception 예외 클래스의 자식클래스로 선언하고
 실행예외는 RuntimeException 예외 클래스의 자식클래스로 선언함
 
 예. 은행잔고보다 많은 금액 출금 요청에 대한 예외 처리
 

 
 */


//일반예외를 상속하여 사용자 정의 예외를 만들어보자 (아래 코드가 기본 틀임)
package ch11.sec06;

public class InsufficientException extends Exception {

	//기본 생성자
	public InsufficientException() {
		
	}
	
	//예외 문자열 메시지 입력 받을 생성자
	public InsufficientException(String message) {
		//부모생성자 호출
		super(message);
	}
}
