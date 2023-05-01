package ch15.sec03.exam02;


//hashCode(), equals() 메소드를 재정의하여 이름과 나이가 같으면 동등객체로 하는 Member 클래스를 만들기
public class Member {
	
	private String name;
	private int age;
	
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//해시코드는 저장된 객체의 주소값
	//String의 경우 문자열이 같으면 같은 힙주소를 가지므로 해시코드도 같음
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member member) {
			if(member.name.equals(name) && (member.age == age)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
		
	}

}
