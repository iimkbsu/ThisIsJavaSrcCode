package ch14.sec03.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {

	//싱글 스레드 환경에서 0.5초마다 5번 비프음 낸 후 "띵"을 0.5초마다 5번 출력
	public static void main(String[] args) {
		
		Toolkit myToolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			myToolkit.beep();
			
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}

	}

}
