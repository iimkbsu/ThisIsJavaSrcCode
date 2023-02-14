package ch02.sec05;

public class BooleanExample {

	public static void main(String[] args) {
		
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다");
		}else {
			System.out.println("진행합니다");
		}
		
		int x = 10;
		boolean result1 = (x == 10);
		boolean result2 = (x != 10);
		boolean result3 = (x > 20);
		boolean result4 = (0 < x && x < 20);
		boolean result5 = (0 < x || x > 20);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
		

	}

}
