package ch09.sec04.exam02;

public class AExample {

	public static void main(String[] args) {
	
		A a = new A();
		A.B b = a.new B();
		
		
		A.C c = new A.C();
		
		//D 로컬 클래스는 외부에서 접근 불가 (생성자, 메소드 실행 할 때만 내부적으로 사용)
		a.useD();

	}

}
