
/*
 Random 클래스의 next@@@() 메소드 이용, 배열 예제
 
 참고 : Math.random() 사용해도 됨
 
 
 로또 번호를 자동생성하고 로또 1등 당첨 확률을 구해보자. 
 
 */



package ch12.sec07;

import java.util.Arrays;
import java.util.Random;



public class LottoExample {

	public static void main(String[] args) {
		
		
		int[] winningNumber = new int[6];
		Random rdw = new Random();
		
		//Random 객체 nextInt() 메소드 중복 제거
		for(int i=0; i<6; i++) {
			winningNumber[i] = rdw.nextInt(45) + 1;
			
			for(int j=0; j<i; j++) {
				
				if(winningNumber[i]==winningNumber[j]) {
					
					i--;
				}
			}
		}
		
		Arrays.sort(winningNumber);
		System.out.println("당첨 번호 : "+Arrays.toString(winningNumber));
		
		
		
		
		int[] selectNumber = new int[6];
		
		
		
		long counts = 0;
		boolean b = false;
		Random rds = new Random();
		
		System.out.print("계산 중 ");
		
		while(!b) {
			counts++;
			
			if((counts % 1000000) == 0) {
				System.out.print("▶");
			}
			
			//Random 객체 nextInt() 메소드 중복 제거
			for(int i=0; i<6; i++) {
				
				selectNumber[i] = rds.nextInt(45)+1;
				
				for(int j=0; j<i; j++) {
					
					if(selectNumber[i] == selectNumber[j]) {
						
						i--;
					}
				}
			}
			
			Arrays.sort(selectNumber);
			
			
			b = Arrays.equals(winningNumber, selectNumber);
		}
		System.out.println();
		System.out.println(Arrays.toString(selectNumber));
		
		
		System.out.println();
		System.out.println();
		System.out.println(counts + "회 도전하여 1등에 당첨되었습니다.");
		double prob = 1.0/counts;
		System.out.printf("당첨 확률 : %f%%", prob*100 );
		
		

	}

}
