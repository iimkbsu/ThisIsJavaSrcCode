
/*
 스레드A와 B 클래스를 각각 만들고 WorkObject를 매개변수로 스레드 생성자 선언.
 생성자 선언 시 스레드 이름을 설정.
 스레드 run()에 WorkObject의 메소드A 메소드B를 각각의 스레드로 10회 실행
 
 */

package ch14.sec06.exam02;

public class ThreadA extends Thread{

	private WorkObject wo;
	
	public ThreadA(WorkObject wo) {
		setName("ThreadA");
		this.wo = wo;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			
			wo.methodA();
			
			//추가한 코드 (콘솔에서 순서를 잘 볼 수 있게 텀 주기)
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			
			
		}
	}
}
