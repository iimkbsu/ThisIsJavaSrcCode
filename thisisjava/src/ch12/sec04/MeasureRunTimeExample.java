
/*
 진행 시간 읽기 : 성능측정 척도, 프로세스 처리 완료 시간 확인
 
 1970년 1월 1일 0시부터 시간 측정되고 있음.
 
 long 타입  currentTimeMillis() (10^-3), nanoTime() (10^-9)
 
 */

package ch12.sec04;

public class MeasureRunTimeExample {

	public static void main(String[] args) {

		
		long Mtime1 = System.currentTimeMillis();
		long Ntime1 = System.nanoTime();
		
		int sum = 0;
		for(int i=1; i<=1000000; i++) {
			sum += i;
		}
		long Mtime2 = System.currentTimeMillis();
		long Ntime2 = System.nanoTime();
		
		System.out.println("int가 가질 수 있는 최대 값 : " + Integer.MAX_VALUE);
		System.out.println();
		System.out.println("1부터 1000000 까지 총 합 :" + sum);
		System.out.println("걸린 시간 초 : " + (0.001 * (Mtime2 - Mtime1)));
		System.out.println("걸린 시간 초 : " + (0.000000001 * (Ntime2 - Ntime1)));
		System.out.println();
		System.out.println("걸린 시간 밀리초 : " + (Mtime2 - Mtime1));
		System.out.println("걸린 시간 나노초 : " + (Ntime2 - Ntime1));

	}

}
