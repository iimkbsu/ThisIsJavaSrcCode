package toy.triangle;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자입력 : ");
		int height = scanner.nextInt();
		System.out.println();
		
		
		
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		for(int i = height; i > 0; i--) {
			for(int j = 0; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		for(int i = height; i > 0; i--) {
			for(int j = height; j > 0; j--) {
				if(i >= j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
		for(int i = 0; i < height; i++) {
			for(int j = height; j > 0; j--) {
				if(i+1 >= j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
