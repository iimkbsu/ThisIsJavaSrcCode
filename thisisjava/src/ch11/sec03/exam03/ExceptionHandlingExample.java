package ch11.sec03.exam03;

//두 가지 예외를 동시에 같은 처리 하기 
//catch(예외클래스 | 예외클래스){}

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

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		String[] array = {"100", "1oo", null, "200"};
		
		for(int i=0; i<= array.length; i++) {
			
			try {
				int value = Integer.parseInt(array[i]);
				System.out.print("array[" + i + "] : " + value);
				System.out.println();
				System.out.println();
			}
			
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("예외처리 1 : " + e.getMessage());
			}
			catch(NullPointerException | NumberFormatException e) {
				System.out.println("예외처리 2 :" + e.getMessage());
			}
			
		}

	}

}
