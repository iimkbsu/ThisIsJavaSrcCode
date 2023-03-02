package ch07.sec10.exam02;

//추상클래스
public abstract class Animal {

	public void breathe() {
		System.out.println("동물이 숨을 쉽니다");
	}
	
	//추상메소드 ({}없고 메소드는 자식마다 다르게 코딩)
	public abstract void sound();
}
