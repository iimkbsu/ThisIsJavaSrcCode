
/*
 
 			자바코드
 			 ↓
 			JVM
 			 ↓
 	┌━━━━━━━━┰━━━━━━━┐
 windows	Mac		리눅스	
 
 
 System 클래스 : 자바코드는 JVM이 실행하기 때문에 각 OS의 기능들을 사용할 수 없는 단점이 있음. 이를 system클래스가 몇몇 OS 기능들을 사용할 수 있게 해줌
 	- (필드) System.out  : 콘솔 문자 출력 (흰색으로 출력됨)
 	- (필드) System.in   : 키보드 입력
 	- (필드) System.err  : 콘솔 에러 출력 (빨간색으로 출력됨)
 	
 	- (메소드) System.exit(int @)				: 프로세스 종료
 	- (메소드) System.currentTimeMillis()		: 현재시간 밀리초단위 long 값 리턴
 	- (메소드) System.nanoTime()				: 현재시간 나노초단위 long 값 리턴
 	- (메소드) System.getProperty()			: 운영체제 사용자 정보 제공
 	- (메소드) System.getenv()				: 운영체제 환경변수 정보 제공
 	- 등등
 
 */

package ch12.sec04;

public class ErrExample {

	public static void main(String[] args) {
		
		try {
			int value = Integer.parseInt("1oo");
		}catch(NumberFormatException e) {
			System.err.println("에러내용 :" + e.getMessage());
			System.out.println();
			System.out.println("출력내용 :" + e.getMessage());
		}
		
		
	}

}






