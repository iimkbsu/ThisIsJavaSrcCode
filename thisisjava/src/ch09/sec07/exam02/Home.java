package ch09.sec07.exam02;

public class Home {
	
	//인터페이스 타입에 익명구현객체 생성후 대입
	private RemoteControl rc = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("익명구현객체1의 turnOn()");
		}
		@Override
		public void turnOff() {
			System.out.println("익명구현객체1의 turnOff()");
		}
	};
	
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	public void use2() {
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("메소드 안에 로컬 익명구현객체의 오버라이딩 turnOn()");
				
			}
			@Override
			public void turnOff() {
				System.out.println("메소드 안에 로컬 익명구현객체의 오버라이딩 turnOff()");
				
			}
		};
		rc.turnOn();
		rc.turnOff();
	}
	
	
	public void use3RemoteControl(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}

}
