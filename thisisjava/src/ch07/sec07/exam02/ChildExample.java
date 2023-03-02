package ch07.sec07.exam02;

public class ChildExample {

	public static void main(String[] args) {
		
		//Parent myParent = new Child();
		Child myChild = new Child();
		
		//클래스 자동타입변환
		Parent myParent = myChild;
		
		
		myParent.method_1();
		myParent.method_2();
		
		
		
		//부모클래스로부터 상속받은 자식클래스의 부모클래스 타입변환 시 부모클래스의 필드와 메소드만 접근 가능
		//단, 자식클래스의 오버라이드 된 메소드가 있을 경우 오버라이딩 메소드만 접근, 사용 (다형성)
		
		//컴파일에러 (호출 불가능)
		//myParent.method_3(); 
		//클래스 타입변환으로 자식 메소드 사용불가, 오버라이딩 메소드도 아님
		

	}

}
