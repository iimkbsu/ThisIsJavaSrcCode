package ch03.sec03;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
		byte var1 = 125;
		byte tmp;
		for(int i = 0; i <5; i++) {
			tmp = (byte) (var1 + (byte)i);
			System.out.println(tmp);
		}
		System.out.println("----------------------");
		
		byte var2 = 125;
		for(int i = 0; i <5; i++) {
			var2++;
			System.out.println(var2);
		}
	}

}
