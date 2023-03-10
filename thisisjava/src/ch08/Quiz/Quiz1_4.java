package ch08.Quiz;

public class Quiz1_4 {

	
	/*
	 1. 인터페이스에 대한 설명으로 틀린 것은?
	 	- 인터페이스로 객체(인스턴스) 생성할 수 있다 (X) 인터페이스는 implement 클래스(구현 클래스)의 객체를 생성하여 사용해야 함
	 	- 인터페이스는 다형성의 주된 기술로 사용된다
	 	- 인터페이스를 구현한 객체는 인터페이스로 동일하게 사용할 수 있다
		- 인터페이스를 사용함으로써 객체 교체가 쉬워진다
	 
	 2. 인터페이스의 구성 멤버에 대한 설명으로 틀린 것은?
	 	- 인터페이스는 인스턴스 빌드가 없고 상수를 멤버로 가진다 (필드 선언 시 대문자로 작성)
	 	- 추상 메소드는 구현 클래스가 재정의해야 하는 멤버이다 (인터페이스 메소드는 빌드 시 자동으로 추상메소드가 되고 구현 클래스가 무조건 재정의 해줘야 함)
	 	- 디폴트 메소드는 구현 클래스에서 재정의 할 수 없다 (X) (재정의 가능, 인터페이스의 default 메소드는 {}이 있지만 구현 객체에서 실행되어야 함)
	 	- 정적 멤버는 구현 객체가 없어도 사용할 수 있는 멤버이다 (정적 멤버는 어디서든지 객체없이 사용 가능)
	 	
	 3. 인터페이스 다형성에 대한 설명으로 틀린 것은?
	 	- 필드가 인터페이스 타입일 경우 다양한 구현 객체를 대입할 수 있다
	 	- 매개변수가 인터페이스 타입일 경우 다양한 구현 객체를 대입할 수 있다
	 	- 배열이 인터페이스 타입일 경우 다양한 구현 객체를 저장할 수 있다
	 	- 구현 객체를 인터페이스 타입으로 변환하려면 강제 타입 변환을 해야 한다 (X) (자동타입변환, casting은 구현클래스 변수 = (구현클래스) 인터페이스 변수; )
	 	
	 4. 인터페이스 A를 B와 C가 구현하고 B를 상속해서 D 클래스를, C를 상속해서 E 클래스를 만들었을 때, 다음 [] 안에 들어올 수 있는 것은?
	 
	 	========================
	 	void method(A a){
	 	}
	 	
	 	method([ ])
	 	========================
	 	1. new B()  2. new C()  3. new D()  4. new E()
	 	
	 	A a = new B(); 자동타입변환 (인터페이스 - 구현객체)
	 	A a = new C(); 자동타입변환 (인터페이스 - 구현객체)
	 	A a = new D(); 자동타입변환 (인터페이스 - 구현객체 - 자식객체)
	 	A a = new E(); 자동타입변환 (인터페이스 - 구현객체 - 자식객체)
	 	정답. 전부 다 됨
	 
	 */
}
