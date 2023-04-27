package ch14.Quiz.Quiz08;

public class ThreadExample {

	public static void main(String[] args) {
		Thread thread = new MovieThread();

		//답 코드
		thread.setDaemon(true);
		
		thread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
	}

}
