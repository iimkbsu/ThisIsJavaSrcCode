package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		//상속 = 부모클래스의 필드&메소드를 자식클래스에게 물려줌
		
		//Phone이라는 부모클래스의 필드와 메소드를 SmartPhone에 상속하여 
		//SmortPhone에서 Phone의 필드와 메소드도 사용 가능
		
		SmartPhone myPhone = new SmartPhone("갤럭시", "실버");
		
		System.out.println(myPhone.model);
		System.out.println(myPhone.color);
		
		System.out.println("와이파이상태 : " + myPhone.wifi);
		
		myPhone.bell();
		myPhone.sendVoice("여보시오");
		myPhone.receiveVoice("누구시오");
		myPhone.sendVoice("나요 김두환이 4달라!");
		myPhone.hangUp();
		
		myPhone.setWifi(true);
		myPhone.internet();
		
	}

}
