package ch08.sec09;

public class ExtendsExample {

	public static void main(String[] args) {
		
		
		//인터페이스 구현 클래스 객체생성 초기화
		InterfaceCImpl myImpl = new InterfaceCImpl();
		
		
		//인터페이스 타입 변수에 구현 클래스 대입
		InterfaceA ia = myImpl;
		ia.methodA();
		//ia.methodB(); //메소드 없어서 에러
		//ia.methodC(); //메소드 없어서 에러
		System.out.println();
		
		//인터페이스 타입 변수에 구현 클래스 대입
		InterfaceB ib = myImpl;
		ib.methodB();
		System.out.println();
		
		
		//인터페이스 타입 변수에 구현 클래스 대입
		InterfaceC ic = myImpl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
