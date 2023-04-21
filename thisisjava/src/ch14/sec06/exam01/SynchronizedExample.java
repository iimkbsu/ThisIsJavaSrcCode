
/*
 * 
 동기화 비동기화
	- 동기화(Synchronous) 	: 데이터 요청에 대한 응답이 돌아왔을 때 다음 동작을 수행 (요청 후 응답 전까지 대기상태)
		□□□□□□□□
				■■■■■■■■■■■■
							▤▤▤▤▤▤▤▤▤▤
						
	- 비동기화(Asynchronous)	: 데이터 요청에 대한 응답과는 별개로 다음 동작 바로 수행 (요청 후 다음 동작 바로 실행)
		□□□□□□□□
		■■■■■■■■■■■■
		▤▤▤▤▤▤▤▤▤▤
		


스레드 동기화
	- 스레드가 어떤 객체의 동기화 메소드, 동기화 블록을 사용할 때 다른 스레드가 동기화 메소드, 동기화 블록에 접근할 수 없도록 하는 기술
	- 일반 메스드는 여러 스레드가 동시에 접근 가능
	

동기화 메소드 및 블록 선언
	
	
	□□□□□□□□ 메소드 전체를 동기화 □□□□□□□□
	
	public synchronized void 동기화메소드명(){
		하나의 스레드만 실행 가능 내용
	}

	
	
	□□□□□□□□ 메소드 내용중 일부만 동기화 □□□□□□□□
	
	public void 메소드명(){
		
		synchronized(공유객체){
			하나의 스레드만 실행 가능 내용
		}
		
		일반 메소드(여러 스레드가 실행 가능)
	}
 
 
 */




package ch14.sec06.exam01;

public class SynchronizedExample {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		User1Thread u1Thread = new User1Thread();
		User2Thread u2Thread = new User2Thread();
		
		u1Thread.setCalculator(calculator);
		u1Thread.start();
		
		
		u2Thread.setCalculator(calculator);
		u2Thread.start();


	}

}




