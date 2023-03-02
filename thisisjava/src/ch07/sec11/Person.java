package ch07.sec11;


//봉인된 클래스(무분별한 상속을 막기 위해 java 15부터) (sealed class ## permits ##,##...)
public sealed class Person permits Employee, Manager{
	
	public String name;
	
	public void work() {
		System.out.println("하는 일이 결정되지 않았습니다");
	}

}
