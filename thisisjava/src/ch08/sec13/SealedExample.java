/*
 
 인터페이스 정의 : 두 장치 또는 두 개체를 연결하는 접속기 또는 매개체를 의미
 	- UI : 사용자 인터페이스. 사용자와 기기 또는 프로그램이 상호작용할 수 있게 하는 매개체
 	- HwI : 하드웨어 인터페이스. 하드웨어끼리 상호작용할 수 있게 하는 매개체 (MIDI, SATA, USB, HDMI 등)
 	- SwI : 소프트웨어 인터페이스. 소프트웨어끼리 상호작용 할 수 있게 하는 맥게체 (API, OpenGL, DirectX 등)
 	
 
 자바 인터페이스 (이클립스 -> new -> interface로 생성)
 	- 다형성 구현의 주된 기술 (추상클래스나 클래스상속으로도 구현 가능하지만 인터페이스를 더 많이 사용)
 	- 객체들 중간에서 매개체 역할
 	- .java -> .class 로 컴파일되기 떄문에 물리적 형태는 일반 클래스와 동일
 	- 인터페이스 단독으로는 사용할 수 없고 구현 클래스를 통해 사용가능
 	
 	
 인터페이스 선언
 	[public] interface 인터페이스명 {
 		
 		public 필드	(*자동상수필드)			: 무조건 static final 상수필드로 자동 컴파일됨
 		public abstract 메소드(){공란}		: 실행문이 없고 무조건 구현 클래스에서 @Override 해줘야 함
 		public default 메소드(){}			: 실행문이 완전한 메소드, 인터페이스타입으로 구현 클래스의 객체를 생성하여 사용, @Override 메소드 재정의 가능
 		[public] static 메소드(){}		: 객체생성 없이 사용 (public이 없어도 자동 public으로 컴파일 됨, 일반 static 메소드는 public없으면 패키지에서만 사용)
 		
 		private 메소드(){}				: 인터페이스 안에서만 사용하는 메소드
 		private static 메소드(){}			: 인터페이스 static 선언된 맴버 안에서만 사용하는 메소드
 	}
 	



 구현클래스 선언
 
	public class 구현클래스명 implements 인터페이스명 {
	
		@Override
		abstract 메소드(){
			실제 구현 실행코드
		}
	}
	
	
	
	
	
 인터페이스 타입 객체 생성(참조타입)
 
 	인터페이스명 변수명 = new 구현클래스();
 	
 
 
 
 
 다중 인터페이스
 
 	public class 구현클래스 implements 인터페이스1, 인터페이스2 ... {
 		
 		@Override
 		abstract 메소드(){
 			구현 실행코드
 		}
 	}
 	
 	
 
 인터페이스 다중상속 (자바에서 유일하게 다중상속 가능)
 
 	public interface 자식인터페이스 extends 부모인터페이스1, 부모인터페이스2... { 
 		....
 	}
 	(*자식인터페이스를 구현하는 객체는 자식인터페이스, 부모1 부모2 인터페이스의 abstract 메소드를 모두 재정의 해야 함)
 	
 	
 	
 다중상속 인터페이스 객체 생성
 
 	자식인터페이스 변수 = new 자식인터페이스를구현한클래스();		: 자식+부모1+부모2 모든 메소드 호출 가능
 	
 	부모1인터페이스 변수 = new 자식인터페이스를구현한클래스();		: 부모1의 메소드만 호출	
 	부모2인터페이스 변수 = new 자식인터페이스를구현한클래스();		: 부모2의 메소드만 호출	
 	
 	
 
 
 자동타입변환 
 	
 	인터페이스 변수 = 구현객체;				: 구현객체가 인터페이스 타입으로 자동 타입 변환됨
 	인터페이스 변수 = 구현객체의 자식객체;		: 자식객체도 역시 인터페이스 타입으로 자동 타입 변환됨
 
 
 
 
 강제타입변화(casting)
 	
 	구현클래스 변수 = (구현클래스) 인터페이스변수;		: 자동타입변환 된 인터페이스변수를 다시 구현 클래스로 강제변환 시키는 방법
 	
 
 
 예.
 
 //인터페이스1 생성
 public interface VolumeButton {.추상메소드1..}
 
 
 //인터페이스1을 상속받은 인터페이스2
 public interface RemoteControl extends VolumeButton {..추상메소드2.}
 
 
 //인터페이스2 구현클래스
 public class Control implements RemoteControl{
 	@Override
 	추상메소드1(){...}
 	추상메소드2(){...}
 }
 
 
 //실행클래스
 public class main{
 	public static void main(String[] args){
 		
 		//구현클래스 객체생성
 		 Control myCon = new Control();
 		
 		//인터페이스 변수에 구현객체 대입 (자동타입변환)
 		 RemoteControl myRC = myCon;	: 인터페이스1, 인터페이스2의 필드와 메소드 모두 사용 가능
 		 
 		//인터페이스 변수에 구현객체 대입 (자동타입변환)
 		 VolumeButton myVol = myCon;	: 인터페이스1의 필드와 메소드만 사용가능
 		 
 		
 		//인터페이스를 구현클래스에 강제 대입 (강제타입변환)
 		Control myCon = (Control) myRC;
 	}
 }
 
 
 	
 	
 
 */

package ch08.sec13;

public class SealedExample {

	public static void main(String[] args) {
		
		ImplClass implclass = new ImplClass();
		
		InterfaceA ia = implclass;
		ia.methodA();
		
		InterfaceB ib = implclass;
		ib.methodA();
		ib.methodB();
		
		
		InterfaceC ic = implclass;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
