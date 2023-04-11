
/*
 프로세스 : 
 	OS는 실행할 프로그램을 장기저장공간(디스크)에서 기억장치(메모리)로 옮겨오고 이를 CPU에서 연산하는 과정을 통해 실행하는데 이를 프로세싱이라 한다.
 	cpu에 올려져 있는 실행중인 프로그램을 프로세스라 한다.
 
 프로세스 강제종료 : System.exit(int 값); //정상종료 : a에 0값 비정상종료 : 1 or -1값
 //예전에는 이 값에 따라 다른 행위를 하도록 코딩했었는데 지금은 안 함.
 
 
 
 */

package ch12.sec04;

public class ExitExample {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			
			if(i == 5) {
				System.exit(0); //프로세스 정상종료, break는 for문만 종료
			}
		}

	}

}
