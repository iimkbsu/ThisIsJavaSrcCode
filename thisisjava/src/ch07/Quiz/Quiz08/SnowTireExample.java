package ch07.Quiz.Quiz08;

public class SnowTireExample {

	public static void main(String[] args) {
		
		SnowTire mySnow = new SnowTire();
		Tire myTire = mySnow; //클래스 자동타입 변환
		
		mySnow.run(); //SnowTire 클래스의 run() 메소드 실행 
		myTire.run(); // 클래스 자동 타입 변환 된 후 오버라이딩 된 SnowTire 클래스의 run() 메소드 실행 

	}

}

/*
 출력 결과
 
 스노우 타이어가 굴러갑니다
 스노우 타이어가 굴러갑니다
 
 */

//메소드 오버라이딩 = 상속된 메소드를 자식 클래스에서 재정의 함
//부모 메소드는 숨겨지고 자식 메소드가 우선 사용됨