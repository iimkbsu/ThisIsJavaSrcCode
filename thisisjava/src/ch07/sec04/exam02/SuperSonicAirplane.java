package ch07.sec04.exam02;

public class SuperSonicAirplane extends Airplane{
	
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	
	public int flyMode = NORMAL;
	
	@Override
	
	// 부모클래스의 fly() 메소드를 재정의, 한 줄만 바꾸고 싶을 때에도 부모클래스 메소드 전부 코딩해야 함
	// super.fly() 사용하면 부모클래스 메소드 호출 가능
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다");
		}else {
			super.fly();
		}
	}

}
