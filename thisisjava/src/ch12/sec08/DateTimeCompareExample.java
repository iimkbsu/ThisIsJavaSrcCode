
/*
 날짜 시간 비교
 
 LocalDateTime 클래스에는 날짜 시간 비교 메소드도 있다
 	- .isAfter()			: 이후 날짜인지? (boolean)
 	- .isBefor()			: 이전 날짜인지? (boolean)
 	- .isEqual()			: 같은 날짜인지? (boolean)
 	
 	- .until(,단위)			: 주어진 단위 차이를 리턴 (long)
 
 */

package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {

	public static void main(String[] args) {
		
		DateTimeFormatter mydtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분 ss초");
		
		LocalDateTime endDateTime = LocalDateTime.of(2023, 4, 10, 11, 0, 0);
		System.out.println("마감시간 : " + endDateTime.format(mydtf));
		System.out.println();
		
		while(true) {
			LocalDateTime startDateTime = LocalDateTime.now();
			System.out.println("현재시간 : " + startDateTime.format(mydtf));
			System.out.println("----------------------------------------");
			
			System.out.print("현재 상태 : ");
			if(startDateTime.isAfter(endDateTime)) {
				System.out.println("마감시간이 종료되었습니다.");
			}else if(startDateTime.isEqual(endDateTime)) {
				System.out.println("마감시간입니다.");
			}else {
				System.out.println("입사지원 서류접수중입니다");
				System.out.println();
			}
			
			/*
			long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
			System.out.println("총 " + remainDay +"일 남았습니다.");
			
			long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
			System.out.println("총 " + remainHour +"시간 남았습니다.");
			
			long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
			System.out.println("총 " + remainMinute +"분 남았습니다.");
			
			*/
			
			long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
			System.out.println("총 " + remainSecond +"초 남았습니다");
			
			int Hour = (int)((remainSecond/60)/60);
			System.out.print(Hour+"시간 ");
			
			int Min = (int)((remainSecond - Hour*60*60)/60);
			System.out.print(Min+ "분 ");
			
			int sec = (int)remainSecond - (Hour*60*60 + Min*60);
			System.out.println(sec+ "초 남았습니다.");
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}

		}
		
		
	}

}
