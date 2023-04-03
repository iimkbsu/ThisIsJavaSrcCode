package ch12.sec03.exam02;

public class Student {
	
	private int stdNo;
	private String stdName;
	
	//학생번호와 학생이름으로 Student 객체 생성하는 생성자 선언
	public Student(int stdNo, String stdName) {
		this.stdNo = stdNo;
		this.stdName = stdName;
	}
	
	//get메소드
	public int getstdNo() {
		return stdNo;
	}
	
	//get메소드
	public String getstdName() {
		return stdName;
	}
	
	
	//hashCode() 메소드 재정의
	//학생번호 + 학생이름의 해시코드를 저장
	@Override
	public int hashCode() {
		//stdName은 string 타입인데 같은 문자열일 경우 hashCode()메소드는 같은 정수값 반환
		int hashCode = stdNo + stdName.hashCode();
		return hashCode;
	}
	
	//equals(Object) 메소드 재정의
	//입력된 객체가 학생 클래스 객체일 경우
	//저장되어있는 학생번호와 생성된 객체의 학생번호가 같고 저장되어있는 학생이름이 객체의 학생이름과 같으면
	//true 반환
	//나머지 false 반환
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student std) {
			if(stdNo == std.getstdNo() && stdName.equals(std.getstdName())) {
				return true;
			}
		}
		return false;
	}

}
