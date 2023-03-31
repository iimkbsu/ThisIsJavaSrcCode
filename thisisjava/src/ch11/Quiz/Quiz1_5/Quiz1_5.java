package ch11.Quiz.Quiz1_5;

public class Quiz1_5 {
	
	/*
	 
	 1. 예외에 대한 설명 중 틀린 것은 무엇입니까?
	 	- 예외는 사용자의 잘못된 조작, 개발자의 잘못된 코딩으로 인한 프로그램 오류를 말한다.
	 	- RuntimeException의 하위 예외는 컴파일러가 예외 처리 코드를 체크하지 않는다.
	 	- 예외는 try-catch 블록을 사용하여 처리한다.
	 	- 자바 표준 예외만 프로그램에서 처리할 수 있다. (X) 
	 	
	 	(사용자 정의 예외처리도 가능, extends Exception 또는 extends RuntimeException 으로 상속 받은 후
	 	일반 생성자와 예외발생 시 생성자를 만든 후 예외발생 생성자에 super(); 메소드로 부모 예외 클래스 호출)
	 	
	 
	 2. try-catch-finally 블록에 대한 설명 중 틀린 것은 무엇입니까?
	 	- try{ } 블록에는 예외가 발생할 수 있는 코드를 작성한다.
	 	- catch(){ } 블록에는 try{ } 블록에서 발생한 예외를 처리하는 블록이다.
	 	- try{ } 블록에서 return 문을 사용하면 finally{ } 블록은 실행되지 않는다. (X) try{ }가 return 되면 finally{ }블록이 마지막에 무조건 실행 됨
	 	- catch(){ } 블록은 예외의 종류별로 여러 개를 작성할 수 있다. (여러 개 사용 가능하며 최상위 예외처리(Exception)를 마지막 catch(){ }에 넣어야 모든 예외처리 가능)
	 
	 
	 3. throws에 대한 설명으로 틀린 것은 무엇입니까?
	 	- 생성자나 메소드의 선언 끝 부분에 사용되어 내부에서 발생된 예외를 떠넘긴다.
	 	- throws 뒤에는 떠넘겨야 할 예외를 쉼표(,)로 구분해서 기술한다.
	 	- 모든 예외를 떠넘기기 위해 간단하게 throws Exception 으로 작성할 수 있다.
	 	- 새로운 예외를 발생시키기 위해 사용된다. (X) throw new 예외클래스
	 	
	
	 4. throw에 대한 설명으로 틀린 것은 무엇입니까?
	 	- 예외를 최초로 발생시키는 코드이다.
	 	- 예외를 호출한 곳으로 떠넘기기 위해 메소드 선언부에 작성된다. (X) 메소드() throws 예외클래스 {}
	 	- throw로 발생된 예외는 일반적으로 생성자나 메소드 선언부에 throws로 떠넘겨진다.
	 	- throw 키워드 뒤에는 예외 객체 생성 코드가 온다.
	 	
	 	
	 	static method() throws 예외클래스 {
	 		
	 		....
	 		
	 		//예외 발생시킬 위치
	 		throw new 예외클래스();
	 	}
	 
	 
	 
	 
	 5. 메소드가 다음과 같이 선언되어있을 때, 잘못된 예외 처리를 고르시오
	 
	 public void method1() throws NumberFormatException, ClassNotFoundException {
	 	....
	 }
	 
	 
	 	- try { method();} catch(Exception e){ } (O)
	 	
	 	- void method2() throws Exception { method1();} (O) (가능은 하나 별로 좋지 않은 코드, 예외 처리 없이 다 떠넘겨버려서 콘솔창에 예외 문구 출력됨)
	 	
	 	- try { method1();} catch(Exception e){ } catch(ClassNotFoundException e) { } (X) (Exception은 ClassNotFoundException보다 상위 클래스이므로 나중에 적어야 함)
	 	
	 	- try { method1();} catch(ClassNotFoundException e){ } catch(NumberFormatException e) { } (O)
	 
	 
	 
	 
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

}
