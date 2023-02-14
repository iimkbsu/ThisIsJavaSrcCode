package ch04.sec03;

public class SwitchExample {

	public static void main(String[] args) {
		
		int diceNum = (int)(Math.random()*9) + 1;
		
		switch(diceNum) {
		case 1:
			System.out.println("1이 나옴");
			break;
		case 2:
			System.out.println("2가 나옴");
			break;
		case 3:
			System.out.println("3이 나옴");
			break;
		case 4:
			System.out.println("4가 나옴");
			break;
		case 5:
			System.out.println("5가 나옴");
			break;
		case 6:
			System.out.println("6이 나옴");
			break;
		case 7:
			System.out.println("6에서 벗어남");
		case 8:
			System.out.println("7에서 벗어남");
		default:
			System.out.println("8에서 벗어남");
		
		
		}

	}

}
