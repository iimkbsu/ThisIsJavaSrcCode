package ch04.sec04;

import java.util.*;

public class SumFrom1To100Example {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.print("정수 입력(0입력시 종료) : ");
			int counts = scanner.nextInt();
			long sum = 0;
			
			if(counts == 0) {
				System.out.println("종료");
				break;
				
			}else {
				
				for(int i = 1; i <= counts; i++) {
					sum += i; //sum = sum + i;
				}
				System.out.printf("1부터 %d까지 더한 값 : %d\n", counts, sum);
			
				
			}
			
			
		}
		

	}

}
