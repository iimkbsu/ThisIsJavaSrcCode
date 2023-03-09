package ch09.sec03.exam01;

public class AExample {

	public static void main(String[] args) {
		
		//A객체 생성없이 바로 B객체 생성 가능
		A.B b = new A.B();
		
		
		//A.C c = new A.C(); //에러
		//C 중첩클래스는 static이 아니라 인스턴스 맴버로 A객체 생성 후 사용해야 함
		A a = new A();
		A.C c = a.new C(); // ==  A.C c = new A().new C();
		
	}

}
