package ch02.sec08;

public class CastingExample {

	public static void main(String[] args) {
		int i_var = 10;
		byte b_var = (byte)i_var;
		System.out.println(b_var);
		
		long l_var = 300L;
		int i_var2 = (int)l_var;
		System.out.println(i_var2);
		
		int i_var3 = 65;
		char c_var = (char)i_var3;
		System.out.println(c_var);
		
		double d_var = 3.14;
		int i_var4 = (int)d_var;
		System.out.println(i_var4);
		
		long l_var1 = 10020302;
		int i_var5 = (int)l_var1;
		System.out.println(i_var5);
		

	}

}
