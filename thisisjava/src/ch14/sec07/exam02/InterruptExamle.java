
/*
 □□□□□□□□ interrupt() 메소드 이용하여 안전 종료 □□□□□□□□

	interrupt() 메소드는 스레드가 일시정지 상태일 때 InterruptedException을 발생시킴. 이를 예외처리 해주면 run()을 정상조료 시킬 수 있음
	
	<스레드>
	
	@Override
	public void run(){
		try{
			while(true){
				...
				Thread.sleep(1); //스레드 순간 일시정지 반복
 			}
		}catch(InterruptedException e){
		}
		//리소스 정리
	}
	--------------------------------
	<main>
	
	Thread thread = new Thread();
	thread.start();
	....
	thread.interrupt(); // interrupt() 메소드 실행 순간 catch()로 넘어감

	
 
 */


package ch14.sec07.exam02;

public class InterruptExamle {

	public static void main(String[] args) {
		
		PrintThread pt = new PrintThread();
		pt.start();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e){
			
		}
		pt.interrupt();

	}

}
