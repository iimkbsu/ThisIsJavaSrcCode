
/*
  매우중요.
 
 와일드카드 타입 파라미터 (매개값이나 리턴 타입에서만 ? 사용)
 	- 제네릭 타입을 매개값이나 리턴 타입으로 사용할 때 ?(와일드카드) 타입 파라미터를 사용할 수 있다.
 	- 범위에 있는 모든 타입으로 대체될 수 있음을 알리는 기능
 	
 
 사용방법
 
 				Person
 				  △
 		┏━━━━━━━━━┻━━━━━━━━━━┓
 		┃					 ┃
 	Worker				  Student
 							 △
 					  ┏━━━━━━┻━━━━━━━┓
 					  ┃				 ┃	
 				HighStudent		MiddleStudent
 				
 
 //타입 파라미터의 대체 타입으로 Studnet 클래스 타입과 이를 상속받은 High, Middle 클래스 타입만 가능하도록 선언하기
  
 리턴타입 메소드명(제네릭타입<? extends Student> 변수){...}
 
 
 
 //Worker와 이의 부모 클래스인 Person만 타입으로 쓸 수 있도록 선언하기
 
 리턴타입 메소드명(제네릭타입<? super Worker> 변수){...}
 
 
 
 //어떤 타입이든 모두 가능하도록 매개변수 선언 (이렇게 사용하는 경우는 거의 없고 대부분 와일드카드 타입에 제한을 준다)
 
 리턴타입 메소드명(제네릭타입<?> 변수){...}
 
 
 
 */


package ch13.sec05;

public class GenericExample {

	public static void main(String[] args) {
		
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		Course.registerCourse1(new Applicant<Person>(new HighStudent()));
		Course.registerCourse1(new Applicant<Person>(new MiddleStudent()));
		System.out.println();
		
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		Course.registerCourse2(new Applicant<Student>(new HighStudent()));
		Course.registerCourse2(new Applicant<Student>(new MiddleStudent()));
		System.out.println();
		
		
		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
		System.out.println();
		Course.registerCourse3(new Applicant<Person>(new Worker()));
		System.out.println();

	}

}



