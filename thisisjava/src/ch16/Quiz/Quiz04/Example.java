
/*
 4. 람다식 작성
 
 출력:
 작업 스레드가 실행됩니다.
 작업 스레드가 실행됩니다.
 작업 스레드가 실행됩니다.
 
 */


package ch16.Quiz.Quiz04;

public class Example {

	public static void main(String[] args) throws Exception {
		
		//Runnable 인터페이스의 익명구현객체로 run() 재정의하기
		Thread thread = new Thread(
				new Runnable() {
					@Override
					public void run() {
						for(int i=0; i<3; i++) {
							System.out.println("작업 스레드가 실행됩니다.");
						}
					}
				}
				
				);
		
		thread.start();
		
		Thread.sleep(100);
		System.out.println();
	
	
		// 람다식으로 작성 (답)
		Thread thread1 = new Thread(() -> {
					for(int i=0; i<3; i++) {
						System.out.println("작업 스레드1이 실행됩니다.");
					}
				});
		
		thread1.start();
	
	
	}

}
