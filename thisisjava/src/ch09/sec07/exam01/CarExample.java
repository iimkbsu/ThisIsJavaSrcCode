package ch09.sec07.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.run(); //일반 타이어가 굴러갑니다 //익명자식객체 1이 굴러갑니다
		car.run2(); //익명 자식 Tire 객체2이 굴러갑니다
		
		
		//매개변수를 Tire의 익명자식객체로 대입하고 메소드 실행
		car.run3(new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체 3이 굴러갑니다");
			}
		}); //익명자식객체 3이 굴러갑니다

	}

}
