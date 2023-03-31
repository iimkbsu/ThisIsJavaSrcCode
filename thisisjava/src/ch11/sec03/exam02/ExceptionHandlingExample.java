
/*
 
 에러와 예외 차이
 에러 : 에러가 발생하면 곧바로 프로그램 종료
 예외 : 예외가 발생하면 곧바로 프로그램 종료 But 예외처리 코드를 통해 끝까지 프로그램 실행 가능 
 
 예외 종류
 일반 예외 : 컴파일러가 실행 전에 예외 처리 코드 여부를 검사함
 실행 예외 : 컴파일러가 예외 처리 코드 여부를 검사하지 않음. 실행 시 예외 발생
 
 								Throwable
 									↑
 									┣━━━━━━━━━━━━━━━━┓
 								Exception(일반예외)	Error
 									↑
			┏━━━━━━━━━━━━━━━━━━━━━━━╋━━━━━━━━━━━━━━━━┳━━━━━━━━━━━━━━━━┓
ClassNotFoundException		InterruptedException	....		RuntimeException(실행예외)
 	(일반예외)						(일반예외)								  ↑
 				┏━━━━━━━━━━━━━━━━━━━━━━━━━┳━━━━━━━━━━━━━━━━━━━━━━━━━━━┫
NullPointException(NPE)		ArrayIndexOutOfBoundsException		NumberFormatException
 	(실행예외)							(실행예외)									(실행예외)
 
 
 
 
 */


package ch11.sec03.exam02;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		String[] array = {"100", "1OO"};
		
		for(int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println(value);
				System.out.println();
			}
			
			//하위 예외 클래스는 상위클래스보다 위에 작성
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e.getMessage()); 
				System.out.println("배열 인덱스가 초과됨");
				System.out.println();
			}
			
			//상위 예외 클래스는 하위보다 밑에 작성
			catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("실행에 문제가 있음");
				System.out.println();
			}
			//상위 예외 클래스는 하위보다 밑에 작성
			catch(Throwable e) {
				System.out.println(e.getMessage());
				System.out.println("실행에 문제가 있음");
				System.out.println();
			}
			
		}

	}

}
