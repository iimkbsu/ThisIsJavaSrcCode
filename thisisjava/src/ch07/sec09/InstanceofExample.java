package ch07.sec09;

public class InstanceofExample {
	
	//클래스가 매개변수로 들어온 정적 메소드 선언
	public static void personInfo(Person person){
		
		System.out.println("name : " + person.name);
		person.walk();
		
		
		//person 부모객체가 student 자식타입 객체 참조하는지 확인
		// 참조하는게 맞으면 student 변수에 대입 (강제 타입변환 발생)
		
		/*  구형문법(지금도 사용가능)
		 public void method(Parent parent){
		 	if(person instanceof Student){
		 		Student student = (Student) person;
		 	}
		 }
		 */

		//신형 문법 ( {}안에 student 변수 바로 사용 가능 )
		if(person instanceof Student student) {
			System.out.println("studnetNo : " + student.studentNo);
			student.study();
		}
		
		
	}
	

	public static void main(String[] args) {
		
		//Person 객체를 매개값으로 제공하고 personInfo() 메소드 호출
		Person p1 = new Person("홍길동");
		personInfo(p1);
		System.out.println();
		
		//Student 객체를 매개값으로 제공하고 personInfo() 메소드 호출
		Person p2 = new Student("난학생", 10);
		personInfo(p2);
	}

}
