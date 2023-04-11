
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
	- Random([시드]); //시드가 같으면 같은 난수 생성
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

import java.util.Arrays;
import java.util.Random;

//로또 프로그램 만들기 (중복 발생 코드임, LottoExample 클래스에 중복제거 코드 작성)
public class RandomExample {

	public static void main(String[] args) {
		
		
		//선택번호
		int[] selectNumber = new int[6];
		Random random = new Random();
		
		System.out.print("선택번호 : ");
		
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		
		//당첨번호
		int[] winningNumber = new int[6];
		random = new Random();
		
		System.out.print("당첨 번호 : ");
		
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		
		//당첨여부
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("당첨 여부 : ");
		if(result) {
			System.out.println("1등에 당첨 되었습니다.");
		}else {
			System.out.println("당첨되지 않았습니다.");
		}
	}

}
