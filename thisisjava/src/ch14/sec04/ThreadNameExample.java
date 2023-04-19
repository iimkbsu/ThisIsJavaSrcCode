
/*
 스레드 이름
	- 스레드는 이름을 갖고 있음
		- 메인 스레드 이름 : main
		- 작업 스레드 이름 : Thread-n
			- Thread 클래스의 setName("이름") 메소드로 작업 스레드의 이름 변경 가능
			
	- 디버깅 시 스레드에서 어떤 메소드가 돌아가는지 조사하기 위함
	
	- 현재 실행중인 스레드 이름(메소드 이름) 얻기
		- Thread myCurrThread = Thread.currentThread();
		- System.out.println(myCurrThread);
		- System.out.println(myCurrThread.getName());
 
 */

package ch14.sec04;

public class ThreadNameExample {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + " 실행"); //main 출력
		

		for(int i=0; i<3; i++) {
			Thread threadA = new Thread() {
				@Override
				public void run() {
					System.out.println(getName() + " 실행");
				}
			};
			threadA.start();
		}

		
		
		
		// 내가 작성해본 코드
		for(int i=0; i<3; i++) {
			Thread threadB = new Thread(new Runnable() {
				@Override
				public void run() {
					Thread thread = Thread.currentThread();
					thread.setName("Runnable 인터페이스 익명구현객체를 대입한 Thread");
					System.out.println(thread.getName() +" 실행");
				}
			} );
			threadB.start();
		}
		
		
		
		
		
		

		Thread chatThread = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + " 실행");
			}
		};
		
		chatThread.setName("chat-thread");
		chatThread.start();

	}

}
