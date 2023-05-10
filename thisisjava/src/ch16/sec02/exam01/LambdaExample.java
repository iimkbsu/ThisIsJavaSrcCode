package ch16.sec02.exam01;

public class LambdaExample {

	public static void main(String[] args) {
		
		Person myPerson_1 = new Person();
		
		//매개변수 없는 익명함수, 람다식
		myPerson_1.action(()->{
			System.out.println("출근");
			System.out.println("코딩");
		});
		
		//매개변수 없는 익명함수, 람다식
		myPerson_1.action(()-> System.out.println("퇴근"));

	}

}
