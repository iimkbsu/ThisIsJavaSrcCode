
/*
 
 스레드 안전 종료
	- run() 메소드를 이용하여 리소스를 정리한 후 빠르게 종료 시키는 방법
		- 조건을 이용
		- interrupt() 메소드 이용
		
*참고 : 강제종료인 stop() 메소드는 더 이상 사용하지 않음



□□□□□□□□ 조건 이용하여 스레드 안전 종료 □□□□□□□□

	while문을 이용하여 스레드를 실행하고 조건이 false가 되면 스레드를 빠져나오고 리소스를 정리
	
	
	boolean go = true;
	
	@Override
	void run(){
		while(go){
			//스레드 반복 실행문
		}
		//리소스 정리코드
	}
 
 */


package ch14.sec07.exam01;

public class SafeStopExample {

	public static void main(String[] args) {
		
		PrintThread pt = new PrintThread();
		pt.start();
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			
		}
		
		pt.setStop(true);

	}

}


		
		
		
		
		
		
		
