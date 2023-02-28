package ch07.sec02;

//Phone 부모클래스
public class Phone {
	
	//필드
	public String model;
	public String color;
	
	
	//메소드
	public void bell() {
		System.out.println("벨이 울립니다");
	}
	
	public void sendVoice(String message) {
		System.out.println("본인: " + message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("상대: " + message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다");
	}

}
