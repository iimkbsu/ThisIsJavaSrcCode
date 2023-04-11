
/*
 SimpleDateFormat 클래스
 	- 날짜를 형식화된 문자열로 변환하는 기능 제공
 	- 패턴문자열을 매개변수로 하는 SimpleDateFormat 생성자를 사용하여 객체를 만들어서 사용
 	- Date 클래스의 객체를 만들어서 현재 날짜시간 데이터를 받은 후 사용
 	
 패턴문자
 	- Y		: 년
 	- M		: 월
 	
 	- d		: 일(1~28,29,30,31일)
 	- D		: 일(1~365일)
 	
 	- E		: 요일
 	
 	- a		: AM,PM
 	
 	- w		: 년의 몇 째주
 	- W		: 월의 몇 째주
 	
 	- H		: 0~23시
 	- K		: 0~11시
 	
 	- h		: 1~12시
 	- k		: 1~24시
 	
 	- m		: 분
 	
 	- s		: 초
 	- S		: 밀리초(1/1000)
 
 */


package ch12.sec09;

import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleDateFormatExample {

	public static void main(String[] args) {
		
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 dd일 E요일");
		System.out.println(sdf.format(now));
		System.out.println();
		
		sdf = new SimpleDateFormat("YYYY년의 w째 주");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("M월의 W째 주");
		System.out.println(sdf.format(now));
		System.out.println();
		
		sdf = new SimpleDateFormat("YYYY년의 DDD째 날");
		System.out.println(sdf.format(now));
		System.out.println();
		
		sdf = new SimpleDateFormat("   H시 m분 s초 S밀리초");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("a K시 m분 s초");
		System.out.println(sdf.format(now));

	}

}
