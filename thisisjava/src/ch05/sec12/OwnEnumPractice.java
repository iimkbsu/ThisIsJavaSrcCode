package ch05.sec12;

import java.util.Calendar;
import java.awt.Toolkit;

enum Day{
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}


public class OwnEnumPractice {

	public static void main(String[] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int count = 0;
	
		while(count < 5) {
			toolkit.beep();
			Calendar time = Calendar.getInstance();
			System.out.println(time.getTime());
			try {
				Thread.sleep(1000);
				count++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		Day day = Day.SATURDAY;
		Month month = Month.FEB;
		
		switch(day) {
		case MONDAY : System.out.println("월요일입니다");break;
		case TUESDAY : System.out.println("화요일입니다");break;
		case WEDNESDAY : System.out.println("수요일입니다");break;
		case THURSDAY : System.out.println("목요일입니다");break;
		case FRIDAY : System.out.println("금요일입니다");break;
		case SATURDAY : System.out.println("토요일입니다");break;
		case SUNDAY : System.out.println("일요일입니다");break;
		
		}
		
		switch(month) {
		case JAN : System.out.println("1월입니다");break;
		case FEB : System.out.println("2월입니다");break;
		case MAR : System.out.println("3월입니다");break;
		case APR : System.out.println("4월입니다");break;
		case MAY : System.out.println("5월입니다");break;
		case JUN : System.out.println("6월입니다");break;
		case JUL : System.out.println("7월입니다");break;
		case AUG : System.out.println("8월입니다");break;
		case SEP : System.out.println("9월입니다");break;
		case OCT : System.out.println("10월입니다");break;
		case NOV : System.out.println("11월입니다");break;
		case DEC : System.out.println("12월입니다");break;
		
		}
		
		
		
		

		
	}

}
