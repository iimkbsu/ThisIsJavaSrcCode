
/*
 다른 지역의 시간을 갖고오기
 	-TimeZone 추상 클래스의 상속 객체를 얻어 오버로딩 된 Calendar 추상 클래스의 .getInstance()를 이용하여 매개값으로 넘겨주면 된다.
 	
 사용방법
 TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
 Calendar now = Calendar.getInstance(timeZone);
 
 */


package ch12.sec08;

import java.util.Calendar;
import java.util.TimeZone;

public class LosAngelesExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("로스엔젤리스 현재 시간");
		
		while(true) {
			
			
			//getTimeZone("국가 ID")
			//국가 ID는 TimeZone.getAvailableIDs(); 메소드로 얻을 수 있음
			TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
			Calendar now = Calendar.getInstance(timeZone);
			
			int amPm = now.get(Calendar.AM_PM);
			String strAmPm = null;
			if(amPm == Calendar.AM) {
				strAmPm = "오전";
			}else {
				strAmPm = "오후";
			}
			
			
			int hour = now.get(Calendar.HOUR);
			int minute = now.get(Calendar.MINUTE);
			int second = now.get(Calendar.SECOND);
			
			
			System.out.println(strAmPm +" "+ hour +"시 " + minute + "분 " + second + "초");
			
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				}
			
			
		}
		
		

		
	}

}
