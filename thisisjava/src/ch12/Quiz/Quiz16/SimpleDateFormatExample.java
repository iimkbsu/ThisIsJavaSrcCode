
// 현재시간을 ****년 **월 **일 *요일 **시 **분 형식으로 출력하세요


package ch12.Quiz.Quiz16;

import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleDateFormatExample {

	public static void main(String[] args) {
		
		Date myDate = new Date();
		
		SimpleDateFormat mySDF = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
		
		System.out.println(mySDF.format(myDate));
		

	}

}
