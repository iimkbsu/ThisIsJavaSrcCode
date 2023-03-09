package ch09.sec04.exam03;

public class A {
	
	//로컬 변수(메소드의 매개변수, 메소드 내에서 선언 된 변수)는 final 특징이 있으므로 다른 위치에서 초기화 하지 못 함
	
	
	//final int arg = 초기화 못 해
	public void method1(int arg) {
		
		//final int var  = 초기화 못 해
		int var = 1;

		
		//로컬 클래스 B
		class B {
			
			B(){}
			
			void method2() {
				
				System.out.println("arg : " + arg);
				System.out.println("var : " + var);
				
				//로컬 변수를 로컬 클래스에서 이용하는 순간, final 특성 갖게 되므로 초기화 하지 못 함
				//arg = 2; //에러
				//var = 2; //에러
			}
		}
		
		B b = new B();
		b.method2();
		
		
	}

}
