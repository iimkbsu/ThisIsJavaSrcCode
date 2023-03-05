package ch08.sec09;

public class InterfaceCImpl implements InterfaceC {

	//InterfaceC가 인터페이스A,B를 다중상속 하고 있으므로 C만 구현해도 A,B메소드 사용 가능
	
	@Override
	public void methodA() {
		System.out.println("InterfaceA - methodA() 실행");
	}
	
	@Override
	public void methodB() {
		System.out.println("InterfaceB - methodB() 실행");
	}
	
	@Override
	public void methodC() {
		System.out.println("InterfaceC - methodC() 실행");
	}
}
