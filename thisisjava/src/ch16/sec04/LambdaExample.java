package ch16.sec04;

public class LambdaExample {
	
	public static double sum(double x, double y) {
		return x + y;
	}

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.action((x, y) -> {
			double plus = x + y;
			return plus;
		});
		
		person.action((x, y) -> sum(x,y));
		
		
		
		person.action((x, y) -> {
			return x - y;
		});
		
		
		person.action((x, y) -> x*y);
		
		
		person.action((x, y) -> x/y);

	}

}
