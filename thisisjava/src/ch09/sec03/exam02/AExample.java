package ch09.sec03.exam02;

public class AExample {

	public static void main(String[] args) {
		
		A.B b = new A.B();
		b.method1();
		System.out.println();
		
		
		System.out.println("B의 인스턴스 필드 : "+b.field1);
		System.out.println("B의 정적 필드 : "+ b.field2);
		System.out.println();
		
		//A객체 생성없이 정적 클래스 B사용가능 + B 클래스 안의 정적 메소드 바로 사용 가능
		A.B.method2();

	}

}
