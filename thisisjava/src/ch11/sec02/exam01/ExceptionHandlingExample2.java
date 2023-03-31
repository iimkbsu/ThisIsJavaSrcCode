package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
	
	public static void printLength(String data) {
		
		//예외처리를 통해 실행 도중 NPE를 catch로 예외처리하고 실행을 끝까지 완료함
		
		try {
			int result = data.length();
			System.out.println("문자 수 : " + result);
		}
		//NPE 예외 처리하기 
		//java는 예외 발생 시 해당 예외클래스 사용
		//여기서는 java.lang.NullPointException
		//예외처리 객체를 저장할 수 있게 매개변수에 예외처리 클래스 타입의 변수를 만들어줌
		catch (NullPointerException e){
			//예외클래스의 인스턴스 메소드인 getMessage()를 통해 예외 원인 확인 (출력문이 따로 없어 println 해줘야 함)
			System.out.println(e.getMessage());
			System.out.println();
			//예외클래스의 인스턴스 메소드인 toString()를 통해 예외 종류 + 예외 원인 확인 (출력문이 따로 없어 println 해줘야 함)
			System.out.println(e.toString());
			System.out.println();
			//예외클래스의 인스턴스 메소드인 printStackTrace()를 통해 예외 종류 + 자세한 예외 원인 출력
			e.printStackTrace();
		}
		//finally는 옵션임
		finally {
			System.out.println("[finally 실행]\n");
		}
		
	}

	
	
	
	public static void main(String[] args) {
		
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[프로그램 종료]");

	}

}
