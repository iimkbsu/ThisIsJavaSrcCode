package ch04.sec03;

// switch 표현식
public class SwitchExpressionsExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A','a':
			System.out.println("우수회원");
			break;
		case 'B','b':
			System.out.println("일반회원");
			break;
		default:
			System.out.println("게스트");
		}
		
		//switch 표현식
		switch(grade) {
			case 'A','a'-> {
				System.out.println("우수회원");
			}
			case 'B','b'->{
				System.out.println("일반회원");
			}
			default ->{
				System.out.println("게스트");
			}
		}
		
		//switch 표현식, 메소트 한줄이면 {} 제거 가능
		switch(grade) {
			case 'A','a'->
				System.out.println("우수회원");
			
			case 'B','b'->
				System.out.println("일반회원");
			
			default ->
				System.out.println("게스트");
		}
		
		
		
		
	}

}
