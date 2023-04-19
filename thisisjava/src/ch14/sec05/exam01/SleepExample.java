
/*
 주어진 시간동안 스레드 일시정지
 
 
 try{
 	Thread.sleep(1000); //1초 일시정지
 }catch(InterrptedException e){
 }
 
  
 */

package ch14.sec05.exam01;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {
		
		Toolkit myTool = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<10; i++) {
			myTool.beep();
			
			try {
				Thread.sleep(300);
			}catch(InterruptedException e) {
				
			}
		}

	}

}
