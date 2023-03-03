package ch07.Quiz.Quiz12;

public class Example {
	
	//매개값이 C 객체일 경우에만 method2()가 호출되도록.
	// 부모 객체 instacneof 자식타입 
	//부모 객체가 자식타입으로 자동타입변환 된 경우 true
	
	public static void action(A a) {
		a.method1();
		if(a instanceof C c) {
			c.method2();
		}
	}
	

	public static void main(String[] args) {
		
		//A a = new A(); //(자동타입변환)
		//action(a);
		action(new A());
		
		//a = new B(); //(자동타입변환)
		//action(a);
		action(new B());
		
		
		//a = new C(); (자동타입변환)
		//action(a);
		action(new C());
		
	}

}
