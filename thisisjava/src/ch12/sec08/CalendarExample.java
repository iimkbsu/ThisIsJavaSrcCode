
/*
 * 
 java.util.Date 클래스				: 날짜 정보 저장 및 전달하기 위한 클래스 (단순 전달)
 java.util.Calendar 클래스 			: 다양한 시간대별로 날짜와 시간을 얻어야 할 때 사용 클래스 (사용자가 확인하기 위해)
 java.time.LocalDateTime 클래스		: 날짜 시간 조작 클래스 (조작)
 
 
 Calendar 추상 클래스
 	- static 메소드인 getInstance() 메소드를 이용하여 기본적인 컴퓨터 상 시간대를 사용하는 하위 객체를 얻을 수 있음 ( Calendar myCal = Calendar.getInstance(); )
 	- 특별한 역법은 자식클래스에서 구현하도록 구성되어있음
 	- get() 메소드를 이용하여 날짜 및 시간에 대한 정보 얻을 수 있음 (int 형 반환)
 	
 종류
 	- myCal.get(Calendar.YEAR);
 	- myCal.get(Calendar.MONTH) + 1;
 	- myCal.get(Calendar.DAY_OF_MONTH); == myCal.get(Calendar.date);
 	- myCal.get(Calendar.AM_PM);
 	- myCal.get(Calendar.HOUR);
 	- myCal.get(Calendar.MINUTE);
 	- myCal.get(Calendar.SECOND);
 	
 
 
 */


package ch12.sec08;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		
		
		
		
		while(true) {
			
			//Calendar은 추상 클래스이므로 객체 생성이 안 됨. 
			//.getInstance() 메소드를 통하여 간접적으로 상속 클래스의 하위 객체 갖고오기
			//(하나의 객체만 사용하는 싱글톤 패턴에서 new 객체 생성대신 getInstance() 사용)
			Calendar now = Calendar.getInstance();
			
			//Calendar 추상 클래스의 YEAR 정적 필드를 Calendar 간접객체의 get()메소드의 매개변수로 사용하여 값 리턴
			int year = now.get(Calendar.YEAR);
			int month = now.get(Calendar.MONTH)+1;
			int day = now.get(Calendar.DAY_OF_MONTH);
			
			int week = now.get(Calendar.DAY_OF_WEEK);
			
			
			String strWeek = null;
			
			
			switch(week) {
			case Calendar.MONDAY : 
				strWeek = "월";
				break;
			case Calendar.TUESDAY :
				strWeek = "화";
				break;
			case Calendar.WEDNESDAY :
				strWeek = "수";
				break;
			case Calendar.THURSDAY :
				strWeek = "목";
				break;
			case Calendar.FRIDAY :
				strWeek = "금";
				break;
			case Calendar.SATURDAY :
				strWeek = "토";
				break;
			default: 
				strWeek = "일";
			}
			
			
			int amPm = now.get(Calendar.AM_PM);
			String strAmPm = null;
			if(amPm == Calendar.AM) {
				strAmPm = "AM";
			}else {
				strAmPm = "PM";
			}
			
			int hour = now.get(Calendar.HOUR);
			int minute = now.get(Calendar.MINUTE);
			int second = now.get(Calendar.SECOND);
			
			System.out.println(year + "년 " + month + "월 " + day + "일 " + strWeek + "요일");
			System.out.println(strAmPm +" "+ hour + "시 " + minute + "분 " + second + "초");
			
			
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			
			
		}

		

	}

}




