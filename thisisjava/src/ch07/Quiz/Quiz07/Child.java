package ch07.Quiz.Quiz07;

public class Child extends Parent {
	
	public String name;
	
	public Child() {
		this("홍길동"); 
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		//super(); //자식생성자에 부모 생성자 호출 숨겨져 있음
		this.name = name;
		System.out.println("Child(String name) call");
	}

}
