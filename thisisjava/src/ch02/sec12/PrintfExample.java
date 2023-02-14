package ch02.sec12;

public class PrintfExample {

	public static void main(String[] args) {
		
		int value = 123;
		System.out.printf("상품의 가격: %d원\n", value);
		System.out.printf("상품의 가격: \t%d원\n", value);
		System.out.printf("상품의 가격: %d\t원\n", value);
		System.out.printf("상품의 가격: %6d원\n", value);
		System.out.printf("상품의 가격: %06d원\n", value);
		
		int radius = 10;
		double area = 3.14159 * radius * radius;
		System.out.printf("반지름 %d인 원의 넓이:%.2f\n", radius, area);
		
		String name = "김범수";
		String job = "백수";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job );
		
	}

}
