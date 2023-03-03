package ch07.Quiz.Quiz06;

public class Child extends Parent{

	public int studentNo;
	
	public Child(String name, int studentNo) {
		
		//this.name = name; //this는 해당 클래스 필드 참조, 부모 클래스 필드 참조하려면 super() 사용
		super(name);
		
		this.studentNo = studentNo;
	}
	
	
	//객체 생성하고 출력해보기
	public static void main(String[] args) {
		Child myChild = new Child("둘리", 1000);
		System.out.println(myChild.name + " " + myChild.studentNo);
	}
}
