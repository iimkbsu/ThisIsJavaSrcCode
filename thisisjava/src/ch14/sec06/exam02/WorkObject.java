
/*
 WorkObject (작업 공유 객체) 클래스를 선언하고 동기화된 메소드A와 메소드B를 만듦
 
 메소드A, 메소드B는 각자 최근 스레드 상태를 출력한 후 상대 스레드를 대기상태로 호출한 후 스스로 대기상태로 만듦
 
 
 */

package ch14.sec06.exam02;

public class WorkObject {
	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodA 작업 실행");
		
		notify();
		try {
			wait();
		}catch(InterruptedException e) {
			
		}
		
	}
	
	public synchronized void methodB() {
		Thread thread =Thread.currentThread();
		System.out.println(thread.getName() + ": methodB 작업 실행");
		
		notify();
		try {
			wait();
		}catch(InterruptedException e) {}
	}

}
