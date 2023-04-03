
/*
 
 //기본적인 기능
 toString() : 객체(Object)의 데이터를 문자열로 가져옴 (구성 : 클래스명@16진수해시코드)
 
 Object 클래스의 메소드이므로 모든 클래스에서 사용 가능. (모든 클래스는 Object 클래스 상속)
 
 */


//toString() 메소드 재정의를 통해 휴대폰객체의 제조사와 OS를 문자열로 반환하는 코드 작성
package ch12.sec03.exam03;

import java.util.Date;

public class ToStringExample {

	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");
		System.out.println(myPhone.toString());
		
		//toString() 없이 Object만 적어도 문자열로 반환해줌
		System.out.println(myPhone);
		
		
		// Date 클래스에서 재정의된 toString()은 현재시간을 문자열로 반환
		Date myDate = new Date();
		System.out.println(myDate.toString());

	}

}
