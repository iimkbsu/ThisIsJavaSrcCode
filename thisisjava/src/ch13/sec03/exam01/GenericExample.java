/*  제네릭 메소드
  	- 타입 파라미터를 가지는 메소드
  	- 메소드 선언부에 타입 파라미터를 선언 (기존 제네릭과 차이점)
  	
  기존
  public class 클래스명 <T> {...}
  
  
  메소드 타입 파라미터
  public <T> 리턴타입 메소드명(매개변수){...}
  
  
  
  예.
  boxing() 메소드의 타입파라미터 T로 선언하고 메소드 리턴타입은 Box객체인데 Box객체도 타입파라미터 T를 내용물로 갖고있음
  
  public <T> Box<T> boxing(T t){...}
  
  Box<Integer> box1 = boxing(100);
  Box<String> box2 = boxing("문자열");
  
  
*/


package ch13.sec03.exam01;

public class GenericExample {

	//boxing() 메소드를 통해 Box 객체를 생성하고 set메소드로 T 타입에 값 대입
	//메소드 리턴은 T 타입을 필드값으로 갖는 Box객체 리턴
	public static <T> Box<T> boxing(T t){
		Box<T> myBox = new Box<>();
		myBox.set(t);
		
		return myBox;
	}
	


	//boxing 메소드를 통해 set메소드로 필드에 값이 저장된 Box 객체 맏들기
	public static void main(String[] args) {
		
		Box<Integer> myBox1 = boxing(100);
		Box<String> myBox2 = boxing("홍길동");
		
		int value1 = myBox1.get();
		String value2 = myBox2.get();
		
		System.out.println(value1);
		System.out.println(value2);
		
	}


}



