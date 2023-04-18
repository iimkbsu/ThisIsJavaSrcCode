package ch14.sec03.exam03;

import java.awt.Toolkit;

public class BeepPrintExample {

	//멀티 스레드 환경에서 0.5초마다 5번 비프음 낼 때 동시에 "띵"을 0.5초마다 5번 출력
	
	//Thread 클래스의 익명 자식 객체를 사용
	//Runnable 인터페이스 구현 없이 직접 Thread 클래스의 run() 메소드 재정의하여 사용 (Thread 클래스 안에 Runnable 인터페이스의 run() 메소드 있음)

	public static void main(String[] args) {
		
		Toolkit myToolkit = Toolkit.getDefaultToolkit();
		
		Thread myThread = new Thread() {
			@Override
			public void run() {
				for(int i=0; i<5; i++) {
					myToolkit.beep();
					
					try {
						Thread.sleep(500);
					}catch(Exception e) {
						
					}
				}
			}
		};
		myThread.start();
		
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}

	}

}
