

package ch14.sec02;

public class MainThreadExample {

	public static void main(String[] args) {
		
		//Thread 타입 변수에 Thread 클래스의 static currentThread() 메소드 리턴값 저장하여 getName()으로 스레드 이름 얻기
		System.out.println("메인 메소드 실행");
		
		Thread currThread = Thread.currentThread();
		System.out.println(currThread);
		System.out.println(currThread.getName());
		
		System.out.println("메인 메소드 종료");
		
	}

}
