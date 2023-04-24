
/*
 
 효율적이지 못 한 Thread.sleep(1) 없이 안전 종료 하는 방법
 
 boolean 리턴타입 interrupted() static 메소드
 boolean 리턴타입 isInterrupted() 인스턴스 메소드
 
 위 두 메소드를 사용하여 interrupt() 메소드 호출 여부를 반환받아서 사용
 
 
 */


package ch14.sec07.exam03;

public class InterruptExample {

	public static void main(String[] args) {
		
		PrintThread pt = new PrintThread();
		pt.start();
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			
		}
		pt.interrupt();
		
	}

}
