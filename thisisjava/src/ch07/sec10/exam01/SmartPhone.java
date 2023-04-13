/*


추상클래스 : abstract Class
 	- 공통 필드나 메소드를 추출한 클래스 (여러 클래스에서 공통으로 사용할 때 추상클래스 하나를 만들어 상속시켜서 사용)
 	- 추상클래스로 new 연산자로 객체 생성 X
 	- 상속클래스 extends 추상클래스 {} 로 사용
 	- 상속클래스 new 연산자로 객체 생성해서 사용해야 함
 	
 	- 필드, 생성자, 메소드, 추상메소드 선언 가능
 		- abstract method(){}는 반드시 @Override 상속받은 클래스에서 재정의 해줘야 함

*/


package ch07.sec10.exam01;

public class SmartPhone extends Phone{
	
	//생성자 선언
	SmartPhone(String owner){
		//부모클래스 생성자 호출
		super(owner);
	}
	
	//메소드 선언
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다");
	}

}
