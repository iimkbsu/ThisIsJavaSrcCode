
/*
 
 java.util.Date 클래스				: 날짜 정보 저장 및 전달하기 위한 클래스 (단순 전달)
 java.util.Calendar 클래스 			: 다양한 시간대별로 날짜와 시간을 얻어야 할 때 사용 클래스 (사용자가 확인하기 위해)
 java.time.LocalDateTime 클래스		: 날짜 시간 조작 클래스 (조작)
 
 
 
 Date 타입 객체의 현재 날짜와 시간 데이터 출력이 마음에 들지 않는다면
 SimpleDateFormat 클래스를 이용하여 표현방식을 바꿀 수 있다.
 
 SimpleDateFormat sdf = new SimpleDateFormat("포맷");
 sdf.format(Date 객체)
 

 */


package ch12.sec08;

import java.text.SimpleDateFormat; 
import java.util.Date;


public class DateExample {

	public static void main(String[] args) {
		
		Date now = new Date();
		
		System.out.println(now);
		System.out.println(now.toString());
		System.out.println();
		
		//날짜를 원하는 문자열로 만들어 주는 클래스
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd  HH:mm:ss");
		String str = sdf.format(now);
		System.out.println(str);
		

	}

}
