package ch07.Quiz.Quiz10;

public class Computer extends Machine{
	
	
	public Computer(){
		super();
		
	}
	
	
	//부모 추상클래스의 추상메소드가 존재하는데, 자식 클래스에서 메소드 정의가 되어 있지 않아서 컴파일 에러 남
	public void work() {
		System.out.println("abstract 메소드 work() 재정의, 컴퓨터가 일을 합니다");
	}
	
	

	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		
		myCom.powerOn();
		myCom.work();
		myCom.powerOff();
	}
	
}


