package ch06.sec07.exam03;


//라이브러리 클래스
public class Korean {
	
	
	//필드 생성
	String nation = "대한민국";
	String name;
	String ssn;
	
	
	//생성자 선언
	//필드 전역변수와 매개변수 이름을 같게하고 필드 전역변수를 나타내는 this를 사용
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

}
