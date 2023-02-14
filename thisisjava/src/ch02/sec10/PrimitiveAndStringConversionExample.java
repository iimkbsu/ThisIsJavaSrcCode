package ch02.sec10;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		int value1 = Integer.parseInt("10"); // int value1 = 10;
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1 = " + value1);
		System.out.println("value2 = " + value2);
		System.out.println("value3 = " + value3);
		
		String str1 = String.valueOf(10); //String str1 = "10";
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		
		double d_value = Double.parseDouble(str2);
		float f_value = Float.parseFloat(str2);
		double dd_value = Float.parseFloat(str2);
		float ff_value = (float)Double.parseDouble(str2);
		System.out.println(d_value);
		System.out.println(f_value);
		System.out.println(dd_value);
		System.out.printf("%.2f\n", dd_value);
		System.out.println(ff_value);

	}

}
