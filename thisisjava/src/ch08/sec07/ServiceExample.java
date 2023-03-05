package ch08.sec07;

public class ServiceExample {

	public static void main(String[] args) {
		
		ServiceImpl myService = new ServiceImpl();
		
		//인터페이스의 default 메소드는 완전한 메소드 블록을 갖지만 구현 클래스의 객체를 생성해서 실행해야 함
		myService.defaultMethod1(); 
		System.out.println();
		myService.defaultMethod2();
		System.out.println();
		
		
		//static메소드는 객체생성없이 인터페이스에서 바로 실행
		Service.staticMethod1(); 
		System.out.println();
		Service.staticMethod2(); 
		System.out.println();

	}

}
