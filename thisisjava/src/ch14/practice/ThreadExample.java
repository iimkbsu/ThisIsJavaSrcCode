package ch14.practice;

public class ThreadExample {
	
	public  int result;
	
	public int plus(int a, int b) {
		result = a + b;
		return result;
		
	}
	
	public int minus(int a, int b) {
		result = a - b;
		return result;
	}

	public void printAnswer() {
		System.out.println(result);
	}
	
	/////////////////////////
	
	
	public static class myThread extends Thread{
		@Override
		public void run() {
			ThreadExample myTE = new ThreadExample();
			myTE.plus(1, 3);
			myTE.printAnswer();
			System.out.println(Thread.currentThread());

			myTE.minus(3,1);
			myTE.printAnswer();
			System.out.println(Thread.currentThread());

		}
	}

	////////////////////////
	
	public static class Task implements Runnable{
		@Override
		public void run() {
			ThreadExample myTE = new ThreadExample();
			myTE.plus(3, 1);
			myTE.printAnswer();
			System.out.println(Thread.currentThread());

			myTE.minus(1,3);
			myTE.printAnswer();
			System.out.println(Thread.currentThread());

		}
	}
	
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		
		Thread myThread1 = new Thread();
	
		myThread myThread2 = new myThread();
		
		Thread myThread3 = new Thread(new Task());
		
		myThread1.start(); //아무것도 출력 안 됨
		myThread2.start(); // 4 2 출력
		myThread3.start();// 4 -2 출력
		
		
		Thread myThread4 = new Thread() {
			@Override
			public void run() {
				ThreadExample mm = new ThreadExample();
				mm.plus(10, 3);
				mm.printAnswer();
				System.out.println(Thread.currentThread());
				mm.minus(10, 3);
				mm.printAnswer();
				System.out.println(Thread.currentThread());
			}
		};
		
		myThread4.start();
		
		
		
		
		Thread myThread5 = new Thread(new Runnable() {
			@Override
			public void run() {
				ThreadExample mn = new ThreadExample();
				mn.plus(12, 3);
				mn.printAnswer();
				System.out.println(Thread.currentThread());
				mn.minus(3, 12);
				mn.printAnswer();
				System.out.println(Thread.currentThread());
				
			}
		});
		myThread5.start();
		
		
		
		
	}

}




