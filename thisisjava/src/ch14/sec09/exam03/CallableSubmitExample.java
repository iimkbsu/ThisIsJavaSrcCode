
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
		
		
		
		

	□□□□□□□□ 작업 생성과 처리 요청 □□□□□□□□
	
	< 작업생성 >
		- 하나의 작업은 Runnable 또는 Callable 인터페이스의 구현 클래스로 표현 및 객체 생성
		
		
		<Ruunalbe 익명 구현객체>	// run() 리턴값 : 없음 , 많이 씀
		
		new Runnable(){
			@Override
			public void run(){
				//스레드 처리 작업 내용
			}
		}
		------------------------------
		
		<Callable 익명 구현객체>	// call() 리턴값 : Callable<T>에서 지정한 T 타입 파라미터와 동일한 타입, 많이 안 씀
		
		new Callable<T> {
			@Override
			public T call() throws Exception {
				//스레드 처리 작업 내용
				return T;
			}
		}
		
		
	
	< 작업처리 요청 >
		- ExcecutorService 인터페이스에서 두 가지 메소드 제공
		- 생성된 객체 작업 큐에 작업을 저장 및 처리하는 방법
		
		(void 리턴타입)		execute(Runnable command)	: Runnable을 작업 큐에 저장, 처리결과 리턴 없음
		(Future<T> 리턴타입)	submit(Callable<T> task)	: Callable을 작업 큐에 저장, 처리 결과 Future를 T 타입으로 리턴
		
		
		*참고 new SynchronousQueue<Runnable>() //작업 큐 객체 생성
		
		
		
		

 
 */


// 자연수 덧셈 작업
// 100개 Callable 생성, submit() 메소드로 작업 큐에 넣음
// ExecutorService로 스레드풀을 만들고 최대 5개 스레드로 Callable을 하나 씩 꺼내어 call() 메소드를 실행하며 작업처리 함
// Future의 get() 메소드로 작업이 끝날 때 까지 기다렸다가 call() 메소드 리턴값을 받아 다시 리턴


package ch14.sec09.exam03;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class CallableSubmitExample {

	public static void main(String[] args) {
		
		//ExecutorService로 스레드풀을 만들고 최대 5개 스레드를 사용
		ExecutorService es = Executors.newFixedThreadPool(5);
		
		
		for(int i=1; i<=100; i++) {
			final int idx = i;
			
			Future<Integer> future = es.submit(new Callable<Integer>() {
				@Override
				public Integer call() throws Exception {
					int sum = 0;
					for(int i=1; i<=idx; i++) {
						sum += i;
					}
					Thread thread = Thread.currentThread();
					System.out.println("[" + thread.getName() + "] 1~" + idx + " 합 계산" );
					return sum;
				}
			});
			
			try {
				int result = future.get();
				System.out.println("\t리턴값 : " + result);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		es.shutdown();
		

	}

}



