package ch02.sec04;

public class FloatDoubleEample {

	public static void main(String[] args) {
		//정밀도 확인
		//자바는 기본적으로 double형이라 float 변수 설정시 값
		//뒤에 f 작성
		float var1 = 0.1234567890123456789f;
		double var2 = 0.1234567890123456789;
		System.out.printf("%%f=%f\n%%f=%f\n",var1, var2);
		System.out.println("float var1= " + var1);
		System.out.println("double var2= " + var2);
		
		//10의 거듭제콥 리터럴(부동소수점)
		double var3 = 3e6;
		float var4 = 3e6F;
		double var5 = 2e-3;
		System.out.println("var3 = " + var3);
		System.out.println("var4 = " + var4);
		System.out.println("var5 = " + var5);
		
		
		//부동소수점의 정밀도
		//단정밀도 = 32bit (float)
		//배정밀도 = 64bit (double)


	}

}
