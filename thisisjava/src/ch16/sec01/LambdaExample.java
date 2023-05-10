package ch16.sec01;

public class LambdaExample {

	public static void main(String[] args) {
		
		// 익명구현객체 만들어서 사용
		Calculable myCal = new Calculable() {
			@Override
			public void calculate(int x, int y) {
				int result = x + y;
				System.out.println(result);
			}
		};
		myCal.calculate(20, 10);
		
		
		
		
		//action 메소드에 익명구현객체 매개변수로
		action(new Calculable() {
			@Override
			public void calculate(int x, int y) {
				int result = x + y;
				System.out.println(result);
			}
		});
		
	
				
		//action 메소드에 람다식 매개변수
		action((x, y) ->{
			int result = x + y;
			System.out.println(result);
			
		});
	
		
	}
	
	//action 메소드 매개변수로 인터페이스 타입 받음
	public static void action(Calculable cal) {
		cal.calculate(20, 10);
	}
}
