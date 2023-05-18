
/*
 
 문제1. 앞이 숫자, 뒤가 그림. 동전 한 개를 계속 던질 때 '앞앞' 과 '뒤앞' 중 먼저 나온 쪽이 승리하는 게임에서 두 선택의 승률을 각각 구하라
 
 문제2. '앞뒤뒤' 와 '앞앞뒤' 중 먼저 나온 쪽이 승리하는 게임에서 두 선택의 승률을 각각 구하여라
 
 
 */


package toy;

import java.util.Random;

public class CoinWin {
	
	public static void coin() {
		
		Random rd = new Random();
		rd.setSeed(System.currentTimeMillis());
		
		
		
		int[] tmp = new int[50];
		
		for(int z=0; z<30; z++) {
			
			int a = 0;
			int b = 0;
			
			for(int k=0; k<10000; k++) {
				
				for(int i=0; i<50; i++) {
					tmp[i] = rd.nextInt(2);
				}
				
				for(int j=0; j<50; j++) {
					if(tmp[j] == 0 && tmp[j+1] == 1) {
						a++;
						break;
					}
					if(tmp[j] == 1 && tmp[j+1] == 1) {
						b++;
						break;
					}
				}
				
			}
			
			System.out.println("앞뒤 승리 : "+a + "   뒤뒤 승리 : "+ b);
		}
		
	}

	public static void main(String[] args) {
		
		//앞 0 뒤 1

		
				Random rd = new Random();
				rd.setSeed(System.currentTimeMillis());
				
				
				
				int[] tmp = new int[50];
				
				for(int z=0; z<30; z++) {
					
					int a = 0;
					int b = 0;
					
					for(int k=0; k<10000; k++) {
						
						for(int i=0; i<50; i++) {
							tmp[i] = rd.nextInt(2);
						}
						
						for(int j=0; j<50; j++) {
							if(tmp[j] == 1 && tmp[j+1] == 0 && tmp[j+2] == 0) {
								a++;
								break;
							}
							if(tmp[j] == 1 && tmp[j+1] == 1 && tmp[j+2] == 0) {
								b++;
								break;
							}
						}
						
					}
					
					System.out.println("앞뒤뒤 승리 : "+a + "   앞앞뒤 승리 : "+ b);
				}
				
				System.out.println();
				coin();
				
			
				
				
				
			}
				
				

}
