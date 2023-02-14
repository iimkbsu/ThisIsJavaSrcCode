package ch06.sec06.exam02;

public class CarExample {

	public static void main(String[] args) {
		
		//Car 객체를 myCar 이름으로 생성
		Car myCar = new Car();
		
		//myCar 이름으로 불러온 Car 객체의 각 필드값 읽어오기
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("도장색상 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		//myCar 이름으로 불러온 Car 객체의 speed 필드값 변경
		myCar.speed = 100;
		System.out.println("수정된속도 : " + myCar.speed);
		

	}

}
