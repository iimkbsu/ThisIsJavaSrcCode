
//올해 12월31일까지 며칠 남아있는지 구하시오

package ch12.Quiz.Quiz15;

import java.time.temporal.ChronoUnit;
import java.time.LocalDateTime;


public class RemainDays {

	public static void main(String[] args) {
		
		System.out.println("남은 일수 : " + LocalDateTime.now().until(LocalDateTime.of(LocalDateTime.now().getYear(), 12, 31, 0, 0, 0), ChronoUnit.DAYS) + "일");
		

	}

}
