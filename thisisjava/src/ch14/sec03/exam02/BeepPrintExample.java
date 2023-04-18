package ch14.sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {

	//멀티 스레드 환경에서 0.5초마다 5번 비프음 낼 때 동시에 "띵"을 0.5초마다 5번 출력
	
	//Thread 클래스 직접 사용하여 객체 생성
	//Runnable 인터페이스의 익명 구현객체 사용

	public static void main(String[] args) {
		
		Toolkit myToolkit = Toolkit.getDefaultToolkit();
		
		
		//Thread를 만들어서 main()과 동시에 돌리기 (저기 가서 혼자 놀고있어)
		// 스레드가 끝나야 전체 프로세스가 끝남
		Thread myThread = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println("띵");
					try {
						Thread.sleep(600);
					}catch(Exception e) {
						
					}
				}
				
			}
		});
		
		myThread.start();
		
		
		
		
		for(int i=0; i<10; i++) {
			myToolkit.beep();
			
			try {
				Thread.sleep(400);
			}catch(Exception e) {
				
			}
			
		}
		
		
		
		
	}
	
}