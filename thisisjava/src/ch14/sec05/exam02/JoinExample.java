
/*
 
 join() 사용 방법

	//main 스레드 안에서 실행 된 threadA가 끝날 때 까지 일시정지 했다가 threadA가 끝나면 조인해서 실행대기 함
	
	<Thread main>
	
	Thread threadA = new Thread();
	threadA.start();
	
	try{
		threadA.join();  
	}catch(InterupptedException e){
	}
 
 
 */

//메인스레드와 작업스레드를 분리하고 작업스레드에서 1~100까지 모두 더하는 연산을 다 끝낼을 때
//메인스레드에서 이를 기다렸다가 다 더한 상태를 출력하는 코드

package ch14.sec05.exam02;

public class JoinExample {

	public static void main(String[] args) {
		
		SumThread st = new SumThread();
		st.start(); //st.run()으로 하면 메인 스레드하나에서 전부 연산 함
		
		//join() 메소드 없으면 getSum()시 처음에 0이나 더하다 만 값이 나올 수 있음.
		try {
			st.join();
		}catch(InterruptedException e) {
			
		}
		
		
		System.out.println(st.getSum());

		
		

	}

}
