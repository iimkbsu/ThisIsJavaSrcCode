package ch14.practice.threadPool;


import java.util.concurrent.ExecutorService; //인터페이스
import java.util.concurrent.Executors; //클래스

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.SynchronousQueue;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;



public class ThreadPoolExample {

	public static void main(String[] args) throws Exception {
		
		//new...() 는 static 메소드로 ExecutorService 인터페이스의 스레드풀 구현객체를 반환
		ExecutorService threadPool1 = Executors.newCachedThreadPool();
		
		//new...() 는 static 메소드로 ExecutorService 인터페이스의 스레드풀 구현객체를 반환
		ExecutorService threadPool2 = Executors.newFixedThreadPool(5);
		
		ExecutorService threadPool3 = new ThreadPoolExecutor(3, 20, 20L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
		
		
		threadPool1.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println("스레드풀1 실행");
			}
		});
		threadPool1.shutdown();
		
		
		
		
		threadPool3.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println("스레드풀3 실행");
			}
		});
		threadPool3.shutdownNow();
		
		
		Future<Integer> future = threadPool2.submit(new Callable<>() {
			@Override
			public Integer call() {
				System.out.println("스레드풀2 실행");
				int sum = 0;
				return sum;
			}
		});
		threadPool2.shutdown();
		
		System.out.println("스레드풀2 결과 :" + future.get());
	}


}
