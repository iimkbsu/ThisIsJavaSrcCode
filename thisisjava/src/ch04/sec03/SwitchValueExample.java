package ch04.sec03;

public class SwitchValueExample {

	public static void main(String[] args) {
		String grade = "B";
		
		//java 11이전 문법
		int score1 = 0;
		
		switch(grade) {
		case "A":
			score1 = 100;
			break;
		case "B":
			int result = 100 - 20;
			score1 = result;
			break;
		default:
			score1 = 60;
		}
		System.out.println("score1 = " + score1);
		
		
		//java 12이상 가능
		//yield = 생산하다, 산출하다, 항복하다
		// java 스레드 sleep(), yield(), join() 과 다름
		// 스레드 = 프로세스 흐름 기본단위, cpu 스케쥴링의 기본 단위
		
		int score2 = switch(grade) {
		case "A" -> 100;
		case "B" -> {
			int result = 100- 20;
			//java 13부터 가능
			yield result;
		}
		default -> 60;
		};
		System.out.println("score2 = "+ score2);
		
		
		
		

	}

}
