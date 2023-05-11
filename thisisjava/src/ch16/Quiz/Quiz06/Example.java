package ch16.Quiz.Quiz06;


public class Example {
	
	public static double calc(Function fun) {
		double x = 10;
		double y = 4;
		return fun.apply(x, y);
	}
	
	
	public static void main(String[] args) {
		
		double result = calc((x, y)->{return x/y;});
		System.out.println("result : " + result);
		
		//리턴이 값 하나인 경우 {}와 return 없이 값만 적을 수 있음
		double result1 = calc((x, y)-> x/y);
		System.out.println("result1 : " + result1);
	}
}
