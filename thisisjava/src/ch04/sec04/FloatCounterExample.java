package ch04.sec04;

public class FloatCounterExample {

	public static void main(String[] args) {
		
		// 0.1보다 조금씩 크기 때문에 x+=0.1f하면 1.0000000***이므로 1.0f넘어가서 9회작동
		for(float x = 0.1f; x <= 1.0f; x +=0.1f) {
			System.out.println(x);
		}
		
		System.out.println("------------수정------------");
		for(float y = 0.1f; y <= 1.1f; y+=0.1f) {
			System.out.printf("%.1f\n", y);
		}

	}

}
