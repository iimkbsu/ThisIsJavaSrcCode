package ch14.Quiz.Quiz06;

public class MovieThread extends Thread{

	@Override
	public void run() {
		
		while(true) {
			System.out.println("동영상을 재생합니다");
			
			if(this.isInterrupted()) {
				System.out.println("동영상 재생정지");
				break;
			}
			
			
			//아래의 방법도 가능하나 스레드를 0.001초씩 계속 멈춰야 하므로 자원 낭비
			
			/* 
			try {
				Thread.sleep(1);
			}catch(InterruptedException e) {
				System.out.println("동영상 재생정지");
				break;
			}
			*/
			
		}
		
	}
	
}
