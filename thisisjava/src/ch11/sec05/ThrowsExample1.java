/*
 
 예외 던지기
 
 에소드1(...) throws 예외클래스1, 예외클래스2 ... {
 }
 
 메소드1() 에서 예외가 발생하면 메소드1()을 호출해서 사용하고 있는 곳으로 예외클래스를 던지다.
 호출해서 사용하고 있던 메소드에서는 넘겨진 예외클래스를 예외처리 해줘야 함.
 
 ※대부분의 자바 재공 메소드들은 throws를 포함하고 있으므로 사용자가 예외처리 해줘야 함
 

*/


package ch11.sec05;

public class ThrowsExample1 {

	public static void main(String[] args) {
		
		//findClass()는 예외 throws가 있으므로 메소드 호출 시 예외처리 해줘야 함
		try {
			findClass();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	/*
	findClass()를 실행했을 때 발생하는 예외 ClassNotFoundException 클래스를
	메소드 참조해서 실행하는 곳에 던짐
	
	findClass() 메소드 자체에서 예외처리 해도 되지만 메소드가 호출되는 곳에서
	한번에 처리 하는 것이 깔끔하고 좋음
	*/
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}

}
