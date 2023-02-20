package ch06.sec10.exam03;

//실제로 라이브러리 클래스, 메소드 실행 클래스, 메인 메소드 따로 작성하는게 정석이지만 여기서는 연습을 위해 하나의 소스코드 파일에 작성함
//static은 프로그램이 실행됨과 동시에 JVM이 메모리에 할당시키고 종료될 때 해제됨, 객체생성 없이 static 접근 가능
//인스턴스는 클래스에 속하는 객체, 객체생성시 메모리에 할당되고 접근이 가능해짐

//Car 클래스
public class Car {
	//인스턴스 필드 생성
	int speed;


	//인스턴스 메소드 선언
	void run() {
		System.out.println(speed+"(으)로 달립니다.");
	}

	//정적 메소드 선언
	static void simulate() {
		//Car 클래스 myCar 객체로 생성
		Car myCar = new Car();
		//객체의 인스턴스 맴버 사용
		myCar.speed = 200;
		myCar.run();
	}

	//메인 함수
	public static void main(String[] args) {
		//정적메소드 호출
		simulate();
		
		//인스턴스 맴버들(인스턴스 필드, 인스턴스 메소드) 사용하기위해 객체생성
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	
	}
}
