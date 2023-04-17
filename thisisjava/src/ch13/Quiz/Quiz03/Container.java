
//작성한 코드
package ch13.Quiz.Quiz03;

public class Container <A, B>{

	private A a;
	private B b;
	
	public void set(A a, B b) {
		this.a = a;
		this.b = b;
	}
	
	public A getKey() {
		
		return a;
	}
	
	public B getValue() {
		
		return b;
	}
}
