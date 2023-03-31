package ch11.sec03.exam01;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		//
		String[] array = {"100", "1oo"};
		
		
		//실행 예외 발생
		for(int i=0; i<=array.length; i++) {
			
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array["+ i +"] : " + value);
				System.out.println();
			}catch(NumberFormatException e) {
				System.out.println(e.getMessage());
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
			
		}

	}

}
