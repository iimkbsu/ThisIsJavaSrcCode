package ch02.sec07;




public class PromotionExample {

	public static void main(String[] args) {
		//자동타입변환
		//byte < char, short < int < long < float < double
		/**
		 * 단, byte -> char로는 자동변환 안 됨 (컴파일 에러)
		 * */
		
		
		byte b_value = 10;
		System.out.println("b_value = " + b_value);

		int i_value = b_value;
		System.out.println("i_value = " + i_value);
		
		char c_value = 'A';
		i_value = c_value;
		System.out.println("i_value = " + i_value);
	
		
		i_value = 50;
		long l_value = i_value;
		System.out.println("i_value = " + i_value);
		
		l_value = 100;
		float f_value = l_value;
		System.out.println("f_value = " + f_value);
		
		f_value = 100.5f;
		double d_value = f_value;
		System.out.println("d_value = "+ d_value);
		
		double dd_value = 0.000003125; //3.125E-6;
		System.out.println("dd_value = " + dd_value);
		

	}

}
