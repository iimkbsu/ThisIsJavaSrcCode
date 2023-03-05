package ch08.sec11.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		//Car 클래스로 객체생성 후 초기화
		Car myCar = new Car();
		
		//Car 객체의 run메소드 호출
		myCar.run();
		System.out.println();
		
		//Car객체의 Tire 인터페이스 타입 변수 t1에 금호타이어 객체로 초기화
		//Car객체의 Tire 인터페이스 타입 변수 t2에 금호타이어 객체로 초기화
		//즉, HankookTire()에서 KumhoTire()로 갈아낄 수 있고 다형성 충족
		myCar.t1 = new KumhoTire();
		myCar.t2 = new KumhoTire();
		
		myCar.run();

	}

}
