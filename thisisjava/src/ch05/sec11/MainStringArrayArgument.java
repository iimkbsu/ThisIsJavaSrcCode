package ch05.sec11;

public class MainStringArrayArgument {

	
	//main 메소드의 매게변수 String[] args 뜻
	public static void main(String[] args) {
		
		if(args.length < 2) {
			System.out.println("Need more numbers");
			System.exit(0);
		}else if (args.length >= 3) {
			System.out.println("Too many numbers");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int Num1 = Integer.parseInt(strNum1);
		int Num2 = Integer.parseInt(strNum2);
		
		int sum = Num1 + Num2;
		System.out.println("Total_Sum : " + sum);
		
	}

}
