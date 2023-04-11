
/*
 
 Math 클래스 
 	- 수학 계산을 용이하게 하는 기능 제공
 	- import 없이 사용 가능
 	- 모든 기능 static이라 객체 생성없이 바로 사용 가능
 
 
 주요기능
 	- Math.abs(음수)				: 절대값 리턴
 	
 	- Math.ceil(소수)				: 올림값 리턴
 	- Math.floor(소수)			: 버림값 리턴
 	- Math.round(수)				: 반올림값 리턴
 	 	
 	- Math.max(수1, 수2)			: 비교 후 큰 수 리턴
 	- Math.min(수1, 수2)			: 비교 후 작은 수 리턴
 	
 	- Math.random()				: 0~1 사이의 double 타입 랜덤 수 리턴




java.util.Random 클래스
	- boolean, int, double 난수 쉽게 생성 가능
	- Random([시드]);
	- 메소드
		- nextBoolean()			: true, false 리턴
		- nextDoulbe()			: (0.0 <= x < 1.0) 리턴
		- nextInt()				: (-2^32 <= x <= 2^32-1) 리턴
		- nextInt(int n)		: (0 <= x < n) 리턴

시드란?
	- 컴퓨터는 결정적 유한 오토마타 형태로서 난수(랜덤값)을 출력할 수 없다.
	- seed 씨앗이라는 의미로, 난수를 비슷하게 출력할 수 있도록 해주는 값. 기본값은 보통 현재 시간을 시드로 사용


*/


package ch12.sec07;

import java.util.Random; //boolean, int, double 난수 쉽게 생성

public class MathExample {

	public static void main(String[] args) {
		
		//올림, 버림, 반올림 (double 타입)
		double d1 = Math.ceil(5.12); //천장, 올림 (int 안 되고 double 타입으로 리턴)
		double d2 = Math.floor(5.12); //바닥, 버림 (int 안 되고 double 타입으로 리턴)
		double d3 = Math.round(5.12); //반올림 (int 안 되고 double 타입으로 리턴)
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		
		
		//절대값
		int abs1 = Math.abs(-6);
		double abs2 = Math.abs(-6.1);
		
		System.out.println(abs1);
		System.out.println(abs2);
		
		
		
		//값 비교 최대 최소 리턴
		int max1 = Math.max(1, 2);
		double max2 = Math.max(1, 2.1);
		
		int min1 = Math.min(1, 2);
		double min2 = Math.min(1, 2.1);
		
		System.out.println(max1);
		System.out.println(max2);
		System.out.println(min1);
		System.out.println(min2);
		
		
		
		//Math 클래스를 이용한 난수 발생
		double ran1 = Math.random(); // (0 <= ran1 < 1)
		double ran2 = Math.random()*10; // (0 <= ran2 < 10)
		double ran3 = 1 + Math.random(); // (1 <= ran3 < 2)
		
		System.out.println(ran1);
		System.out.println(ran2);
		System.out.println(ran3);
		
		
		
		
		//java.util.Random 클래스를 사용하여 난수 발생
		Random r = new Random();
		boolean rb = r.nextBoolean();
		int ri1 = r.nextInt();
		int ri2 = r.nextInt(2);
		double rd = r.nextDouble();
		
		int ri3 = new Random().nextInt();
		
		System.out.println(rb);
		System.out.println(ri1);
		System.out.println(ri2);
		System.out.println(rd);
		System.out.println(ri3);
		
		
		
		//소수점 이하 두 자리 얻기 (반올림)
		double dn = 3.141592;
		double tmp = dn * 100;
		double answer = Math.round(tmp) * 0.01;
		System.out.println(answer);

	}

}
