package ch12.sec03.exam03;

public class SmartPhone {

	private String comp;
	private String os;
	
	
	public SmartPhone(String comp, String os) {
		this.comp = comp;
		this.os = os;
	}
	
	
	//Object 클래스의 toString()메소드 재정의
	public String toString() {
		return (comp + ", " + os);
	}
	
}
