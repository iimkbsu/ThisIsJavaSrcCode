package ch07.Quiz.Quiz10;

public abstract class Machine {
	
	boolean powerOn;
	
	//생성자 선언
	public Machine(){
		
	}
	
	public void powerOn() {
		System.out.println("기기의 전원이 켜집니다");
	}
	
	public void powerOff() {
		System.out.println("기기의 전원이 꺼집니다");
	}
	
	public abstract void work();

}
