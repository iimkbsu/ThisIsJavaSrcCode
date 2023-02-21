package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.A;

public class C {
	
	//생성자 선언
	public C() {
		
		A a = new A(); //ctrl + shift + o
		
		a.field1 = 1;
		//a.field2 = 2;  //컴파일 오류
		//a.field3 = 3;  //컴파일 오류
		
		a.method1();
		//a.method2(); //컴파일 오류
		//a.method3(); //컴파일 오류
		
		
		
	}
	
	
	
	

}
