/*
 
 */

package ch14.sec06.exam02;

public class WaitNotifyExample {

	public static void main(String[] args) {
		WorkObject wo = new WorkObject();

		Thread ta = new ThreadA(wo);
		Thread tb = new ThreadB(wo);
		
		ta.start();
		tb.start();
		

	}

}
