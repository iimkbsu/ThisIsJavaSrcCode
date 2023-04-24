package ch14.sec07.exam03;

public class PrintThread extends Thread{

	@Override
	public void run() {
		while(!Thread.interrupted()) {
			System.out.println("실행 중");
		}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
		
	}
	
}
