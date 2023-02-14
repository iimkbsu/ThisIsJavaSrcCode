package ch04.sec04;

public class MultiplicationTableExample {

	public static void main(String[] args) {
		
		int dan = 1;
		
		for(dan = 2; dan <=9 ; dan++) {
		System.out.printf("*** %d단 ***\n", dan);
		
			for(int multi = 1; multi <=9; multi++) {
				System.out.println(dan +" x "+ multi + " = " + dan*multi);
			}
		
		}
		

	}

}
