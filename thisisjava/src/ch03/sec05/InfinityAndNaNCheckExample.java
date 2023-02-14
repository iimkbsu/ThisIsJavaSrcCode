package ch03.sec05;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z = x / y;
		double zz = x % y;
		System.out.println(z + 2);
		System.out.println(zz);
		
		//int zero = 0;
		//System.out.println(x/zero);
		// 무한대 값은 정수표기 안 됨.
		
		//무한대, 숫자가 아닌 것을 예외처리 해줘야 제대로 된 코드
		System.out.println("=============================");
		if(Double.isInfinite(z) || Double.isNaN(z) || Double.isInfinite(zz)||Double.isNaN(zz)) {
			System.out.println("값 산출 불가");
		}else {
			System.out.println(z+2);
		}
	}

}
