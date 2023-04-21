package ch14.sec06.exam01;

public class Calculator {

	
	private int memory;
	
	
	public int getMemory() {
		return memory;
	}
	
	
	//메소드 전체 동기화로 작성
	public synchronized void setMemory1(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}
	
	
	//메소드 일부를 동기화블록으로 작성
	public void setMemory2(int memory) {
		
		//코드 있다고 가정.....
		
		//공유객체 동기화
		synchronized(this) {
			this.memory = memory;
			
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				
			}
			System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		}
		
		//코드 있다고 가정....
	}
	
	
	
}
