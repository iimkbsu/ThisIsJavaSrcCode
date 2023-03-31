package ch11.sec05;

public class ThrowsExample2 {
	
	/*
	 
	main() 함수도 throws 예외클래스 할 수 있는데,
	JVM이 예외를 처리해줌 (콘솔창에 예외 처리 내용 출력)
	추천하는 방식은 아님 
	
	try catch로 예외처리 발생시 실행할 코드 적어주는 걸 추천
	
	*/
	
	//main() throws Exception 비추천
	public static void main(String[] args) throws Exception{
		findClass();
	}
	
	static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.lang");
	}

}
