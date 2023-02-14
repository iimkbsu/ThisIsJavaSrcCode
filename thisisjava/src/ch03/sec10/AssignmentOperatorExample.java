package ch03.sec10;

import java.util.*;

//대입연산자
public class AssignmentOperatorExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int result = scanner.nextInt();
		
		result &= 2;
		System.out.println(result);
		
		result |= 2;
		System.out.println(result);
		
		result ^= 2;
		System.out.println(result);
		
		result >>= 1;
		System.out.println(result);
		
		/*result = result + 10;
		System.out.println(result);
		result += 10;
		System.out.println(result);

		result = result - 10;
		System.out.println(result);
		result -= 10;
		System.out.println(result);
		
		result = result * 2;
		System.out.println(result);
		result *= 2;
		System.out.println(result);
		
		result = result / 2;
		System.out.println(result);
		result /= 2;
		System.out.println(result);
		
		result = result % 2;
		System.out.println(result);
		result %= 2;
		System.out.println(result);
		*/
		

	}

}
