
/*
 
 제네릭
 	- 일반적인, 포괄적인 타입이라는 뜻 (general)
 	- 설계 시 구체적인 타입 지정 X
 	- 실행 시 타입을 지정해서 사용
 	- <T> : 타입 파라미터. <> 안에는 기본타입(예 int)은 올 수 없고 참조가능한 타입(예 Integer 포장클래스)만 올 수 있음
 
 예.
 Box라는 클래스에 content 필드의 타입을 다양하게 넣고 싶음.
 
 public class Box {
 	public ? content;
 }
 
 
 모든 클래스는 Object 타입이기 때문에 Object를 한 번 넣어보자 (모든 클래스는 Object 클래스의 자식클래스)
 
 public class Box {
 	public Object content;
 }
 
 
 Box myBox = new Box();
 myBox.content = 모든객체;
 
 
 만약 content에 String 타입이 저장되어 있는 걸 안다면 (String) 강제 타입 변환을 해서 내용물을 얻을 수 있다.
 
 String content = (String)myBox.content;
 
 그런데 여기서 문제 발생.
 contents는 Object 타입이므로 사실은 어떤 객체가 대입되어 있는지 확신할 수 없다.
 instanceof 연산자로 객체 타입 조사를 할 수 있지만 모든 종류를 조사할 수 있는 건 아님. 게다가 귀찮음.
 
 
 
 제네릭으로 해결해 보자
 
 <T> : 정해진 타입은 아니지만 나중에 구체적인 타입을 결정할 수 있게 해줌. 타입 파라미터
 
 public class Box <T>{
 	public T content;
 }
 
 //content 필드에 문자열 넣기
  
 Box<String> myBox = new Box<>();
 myBox.content = "문자열";
 
 String myContent = myBox.content;
 
 
 
 //content 필드에 정수 넣기
  
  Box<Integer> myBox = new Box<>();
  myBox.content = 20;
  
  int myContent = myBox.content;
 
 
 
 
 
 */


package ch13.sec01;

public class GenericExample {

	public static void main(String[] args) {
		
		Box<String> myBox1 = new Box<>();
		Box<Integer> myBox2 = new Box<>();
		Box<Boolean> myBox3 = new Box<>();
		Box<Double> myBox4 = new Box<>();
		Box<Object> myBox5 = new Box<>();
		
		Box<Object> myBox6 = new Box<>("이름1");
		Box myBox7 = new Box("이름2"); //<> 안 쓰면 Object 타입을 자동 컴파일됨
		
		
		myBox1.content = "문자열";
		myBox2.content = 13;
		myBox3.content = false;
		myBox4.content = 123.456;
		
		myBox5.content = new Box<Object>("이름3");

		
		
		System.out.println(myBox1.content);
		System.out.println(myBox2.content);
		System.out.println(myBox3.content);
		System.out.println(myBox4.content);
		
		System.out.println(myBox5.content);
		System.out.println(myBox5.name);
		
		System.out.println(myBox6.name);
		System.out.println(myBox7.name);
		
		

	}

}
