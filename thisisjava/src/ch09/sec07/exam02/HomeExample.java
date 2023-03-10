package ch09.sec07.exam02;

public class HomeExample {

	public static void main(String[] args) {
		
		Home home = new Home();
		
		home.use1();
		
		home.use2();
		
		//인터페이스 타입을 매개변수로 받는 메소드에 매개변수로 익명구현객체 대입하여 실행
		home.use3RemoteControl(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("인터페이스 타입의 매개변수에 익명구현객체 대입 후 turnOn()");
				
			}
			@Override
			public void turnOff() {
				System.out.println("인터페이스 타입의 매개변수에 익명구현객체 대입 후 turnOff()");
				
			}
		});

	}

}
