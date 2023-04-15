
/*
    제네릭 타입
 	- 타입이 결정되지 않은 파라미터를 가지는 클래스와 인터페이스
 	- <A,B ..> : 타입 파라미터. <> 안에는 기본타입(예 int)은 올 수 없고 참조가능한 타입(예 Integer 포장클래스)만 올 수 있음
 
 	* 타입파라미터는 아무 알파벳이나 써도 됨
 	
 
 
 *인터페이스는 필드가 항상 static final 상수이므로 타입 파라미터를 쓸 수 없음.
 *일반적으로 인터페이스 메소드 또는 추상메소드에 제네릭 타입을 사용
 	
 	
 //제네릭 타입 인터페이스
 public interface 인터페이스명<G, H....> {
 	
 	//추상메소드. public abstract는 자동으로 컴파일됨
 	 G method1(){
 	 }
 	 
 	 H method2(){
 	 }
 	 ...
 }
 	
 
 */


package ch13.sec02.exam02;

public class GenericExample {

	public static void main(String[] args) {
		
		HomeAgency ha = new HomeAgency();
		CarAgency ca = new CarAgency();
		
		
		/*
		ha.rent().turnOnLight();
		ca.rent().run();
		*/
		
		Home myHome = ha.rent();
		Car myCar = ca.rent();
		
		myHome.turnOnLight();
		myCar.run();
		
		
		

	}

}



