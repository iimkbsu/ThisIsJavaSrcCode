package ch02.sec02;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 10000000000;//long타입이지만 컴파일러가 int타입으로 인식
		long var4 = 10000000000L;
		int var5 = 1000000000;
		//int var6 = 1000000000L; //long 타입 안 됨.
		
		System.out.printf("%d %d %d %d", var1, var2, var4, var5);

	}

}
