package ch07.sec04.exam01;

public class Computer extends Calculator {

	//메소드 오버라이딩
	//부모 클래스의 메소드의 이름, 매개변수, 리턴타입이 같아야 함
	//부모 클래스의 메소드보다 접근제한이 강화된 메소드 오버라이딩 불가
	//(public -> private X)
	//(private -> public O)
	
	@Override //컴파일 시 정확히 오버라이딩 됐는지 확인해 줌(생략가능)
	public double areaCircle(double r) {
		return Math.PI * Math.pow(r, 2);
		
		/*
		 public class Math {
		 	public static final double PI = 3.14.......;
		 }
		 * **/
	}
}
