package ch08.Quiz.Quiz05;

//TV 클래스를 실행했을 때 "TV를 켰습니다"가 출력되도록 작성

public class TV implements Remocon {
	
	@Override
	public void powerOn() {
		System.out.println("TV를 켰습니다");
	}
	
	
	public static void main(String[] args) {
		
		Remocon r = new TV(); //자동타입변환 (인터페이스 - 구현객체)
		r.powerOn();

	}

}
