package ch02.sec01;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.printf("x=%d y=%d\n", x, y);
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("<x와 y를 바꾸기>\n");
		System.out.printf("x=%d y=%d", x, y);
	}

}
