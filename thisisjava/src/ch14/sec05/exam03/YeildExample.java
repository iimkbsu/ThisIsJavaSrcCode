
/*
 스레드 양보하기 
 
 □□□□□□□  yield() 사용방법 □□□□□□□

	boolean 타입 work에 대해, work가 false라도 while(true)문은 계속 무한 반복. 이 때 스레드를 양보하여 실행대기를 걸어 효율성을 늘린다.

	public void run(){
		while(true){
			if(work){
				System.out.println("ThreadA 작업 내용");
			}else{
				Thread.yield();
			}
		}
	} 
	
 
 */


package ch14.sec05.exam03;

public class YeildExample {

	public static void main(String[] args) {
		
		WorkThread wt1 = new WorkThread("작업 스레드1");
		WorkThread wt2 = new WorkThread("작업 스레드2");
		
		wt1.start();
		wt2.start();
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			//e.printStackTrace();
		}
		wt1.work = false;
		System.out.println("5초 지난 시점 : 작업 스레드1 일시정지, 스레드 양보");
		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			//e.printStackTrace();
		}
		wt1.work = true;
		System.out.println("10초 지난 시점 : 작업 스레드1 실행대기 및 시작");

	}

}


