
/*
 TimeZone의 국가 id는 문자열 배열에 저장 
 
 */


package ch12.sec08;

import java.util.TimeZone;
import java.util.Calendar;

public class PrintTimeZoneID {

	public static void main(String[] args) {
		
		
		System.out.println("TimeZone ID값");
		String[] id = TimeZone.getAvailableIDs();
		System.out.println(id.length);
		
		for(int i=0; i<id.length; i++) {
			System.out.println(id[i]);
		}
		System.out.println();
		System.out.println();
		
		
		for(int j=0; j<30; j++) {
			TimeZone timezone = TimeZone.getTimeZone(id[j*20]);
			Calendar now = Calendar.getInstance(timezone);
			
			System.out.println(id[j*20].toString() +" : "
			+now.get(Calendar.MONTH) + "월 "
			+now.get(Calendar.DATE) + "일 "
			+ now.get(Calendar.HOUR)+ "시 " 
			+ now.get(Calendar.MINUTE) + "분");
			
		}
		

	}

}
