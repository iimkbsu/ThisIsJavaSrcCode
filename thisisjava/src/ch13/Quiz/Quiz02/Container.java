
//작성한 코드
package ch13.Quiz.Quiz02;

public class Container <T> {
	
	T t;

	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}
