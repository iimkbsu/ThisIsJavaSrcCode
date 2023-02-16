package ch06.sec10.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		
		
		//static 메소드의 경우 객체생성 없이 바로 사용 가능
		// Calculator myCalc = new Calculator(); 필요 없음
		
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
		
		
		//인스턴스 메소드의 경우 객체생성 후 메소드 실행시켜야 함
		Calculator myCalc = new Calculator();
		myCalc.setColor("빨강");
	}

}
