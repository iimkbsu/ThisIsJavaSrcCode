package ch04.sec03;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'A';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("A등급 우수회원");
			break;
		case 'B':
		case 'b':
			System.out.println("B등급 일반회원");
			break;
		default:
			System.out.println("게스트");
			break;
		
			
		}

	}

}
