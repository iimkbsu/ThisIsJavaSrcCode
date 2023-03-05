package ch08.sec08;

public class MultiInterfaceImplExample {

	public static void main(String[] args) {
		
		//SmartTelevision myTV = new SmartTelevision(); 
		//은 인터페이스 없이 객체 생성 해서 사용하는 것
		
		
		
		//인터페이스에 SmartTelevision() 객체 생성하여 사용
		RemoteControl rc = new SmartTelevision();
		
		//인터페이스에 SmartTelevision() 객체 생성하여 사용
		Searchable search = new SmartTelevision();
		
		//다중 인터페이스의 추상메소드 사용 가능
		
		//RemoteControl 인터페이스의 추상메소드
		rc.turnOn();
		
		
		//Searchable 인터페이스의 추상메소드
		search.search("naver");
		
		
		//RemoteControl 인터페이스의 추상메소드
		rc.turnOff();

	}

}
