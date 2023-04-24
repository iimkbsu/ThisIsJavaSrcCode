
/*
 
 ★☆★☆★☆ 매우 중요 ★☆★☆★☆

풀(pool) - 작은 수영장(연못), 공동으로 이용할 데이터나 객체들을 모아두는 곳

스레드 풀
	- 복잡한 프로그램에서 다수의 병렬작업 때문에 여러 개의 스레드를 사용하게 되는데, 이 때 스레드의 폭증을 막는 방법
	- 스레드의 개수를 제한하고 이 스레드들이 작업 큐(FIFO)에서 대기중인 작업들을 순서대로 하나씩 갖고와서 처리한 후 이를 반복 (작업 완료한 스레드 재사용)
	- 스레드 개수가 폭증하여 앱의 실행이 저하되거나 죽는 것을 방지할 수 있음



	□□□□□□□□ 스레드 풀 생성 □□□□□□□□
		
		# java.util.concurrent 패키지에서 ExecutorService 인터페이스, Executors 클래스 제공
		
			*concurrent : 동시 발생하는, 공존하는
			
			
		
		방법 1. Executors 클래스의 static 메소드 이용하여 ExecutorService 인터페이스 구현객체 만들기
		
			- newCachedThreadPool()				: 초기 수:0	코어 수:0 		최대 수:integer.MAX_VALUE		무작업 스레드 유지기간 :60초	사용 여부: 제한이 없어 잘 사용 안 함
			- newFixedThreadPool(int n)			: 초기 수:0	코어 수:생성 수		최대 수:n						무작업 스레드 유지기간 :무한 	사용 여부: 많이 사용 함
			
			import java.util.concurrent.Executors; //클래스
			import java.util.concurrent.ExecutorService; //인터페이스
		
			ExecutorService es = Executors.newCachedThreadPool(); 
			또는
			
			ExecutorService es = Executors.newFixedThreadPool(5);
		
		
		
		방법 2. 위의 두 메소드 없이 ThreadPoolExecutor 클래스(부모 클래스가 ExecutorService 구현 클래스임)로 스레드풀 만들기
			
			* ThreadPoolExecutor 클래스 생성자가 조금 복잡하고 구체적임
			
			ExecutorService threadPool = new ThreadPoolExecutor(
				3,									// 코어 스레드 개수 (계속 유지되는 스레드 3개)
				100,								// 최대 스레드 개수 (제거 될 수 있는 스레드 97개)
				120L,								// 무작업 스레드 유지 시간
				TimeUnit.SECONDS,					// 유지 시간 단위
				new SynchronousQueue<Runnable>()	// 동기화 작업 큐
			);
		



	□□□□□□□□ 스레드 풀 종료 □□□□□□□□
		
		스레드는 모든 작업 스레드가 종료되어야 메인 스레드가 종료되고 작업이 마무리 됨 (데몬 스레드 아님)
		
		ExecutorService 인터페이스의 shutdown(), shutdownNow() 메소드 사용하여 모든 작업 스레드 종료
		
		
		(void 리턴 타입) 				shutdown() 메소드			: 현재 처리 중 작업, 큐 대기 작업을 모두 처리완료 후 스레드풀 종료
		(List<Runnable> 리턴 타입) 	shutdownNow() 메소드		: 현재 처리 중 작업은 interrupt 시켜 중지, 대기 작업은 List리턴값으로 보내고 스레드풀 바로 종료 (중지된 작업은 소실됨)
		
 
 */


package ch14.sec09.exam01;

import java.util.concurrent.Executors; //클래스
import java.util.concurrent.ExecutorService; //인터페이스

public class ExecutorServiceExample {
	


	
	public static void main(String[] args) {
		
		ExecutorService es1 = Executors.newCachedThreadPool();
		ExecutorService es2 = Executors.newFixedThreadPool(5);
		
		es1.shutdown();
		es2.shutdownNow();
		
		
		

	}

}
