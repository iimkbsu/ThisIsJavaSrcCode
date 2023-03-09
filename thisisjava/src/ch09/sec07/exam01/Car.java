package ch09.sec07.exam01;

public class Car {
	
	//익명자식객체 = class가 없고, extends 키워드 없이 자식객체 생성하는 방법
	//어떤 클래스를 명목상 부모클래스로 설정하고 부모클래스 객체 뒤에 {}을 만들어 상속된 객체의 내용을 안에 입력함
	//부모가 될 클래스의 객체가 필요함
	
	//필드 선언 후 클래스 Tire 타입에 객체생성 후 대입
	private Tire tire1 = new Tire();

	// Tire 부모클래스의 익명자식객체 대입
	private Tire tire2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("익명 자식 Tire 객체 1이 굴러갑니다");
		}
	};

	public void run() {
		tire1.roll(); //Tire의 메소드 실행
		tire2.roll(); //익명자식객체의 오버라이딩 된 메소드 실행
	}




	public void run2() {
		//메소드 안에 로컬 익명객체 생성
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체 2가 굴러갑니다");
			}
		};
	//익명객체가 오버라이딩한 roll() 메소드 실행
	tire.roll();
	
	}
	
	
	//매개변수를 타이어 클래스 타입으로 선언한 메소드
	public void run3(Tire tire) {
		//매개변수의 roll()메소드 실행
		tire.roll();
	}


}
