package ch07.sec03.exam01;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		//SmartPhone 객체생성
		SmartPhone myPhone = new SmartPhone("갤럭시", "실버");

		//SmartPhone이 상속받은 Phone의 필드 읽기
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);
	}

}
