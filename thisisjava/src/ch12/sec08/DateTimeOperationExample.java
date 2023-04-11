
/*
 
 날짜 시간 조작하기
 
 LocalDateTime final클래스 (공개 생성자가 없으므로 객체 리턴 메소드 사용해야 함)
 
 
 */



package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperationExample {
	
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		System.out.println();
		
		//날짜와 시간을 원하는 패턴으로 바꾸는 formatter
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		//LocalDateTime 포맷 메소드의 매개객체로 dtf 패턴을 사용
		System.out.println("현재 시간 : " + now.format(dtf));
		System.out.println();
		
		//plus minus
		LocalDateTime result1 = now.plusYears(1000);
		System.out.println(result1);
		System.out.println("1000년 후 시간 : " + result1.format(dtf));
		System.out.println();
		
		LocalDateTime result2 = now.plusHours(3);
		System.out.println(result2);
		System.out.println("3시간 후 시간 : " + result2.format(dtf));
		System.out.println();
		
		LocalDateTime result3 = now.minusYears(1000);
		System.out.println(result3);
		System.out.println("1000년 전 시간 : " + result3.format(dtf));
	}

}
