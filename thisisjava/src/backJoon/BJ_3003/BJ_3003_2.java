package backJoon.BJ_3003;

import java.io.IOException;
import java.util.Scanner;

public class BJ_3003_2 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        int[] input = new int[6];
        int[] chess = {1, 1, 2, 2, 2, 8};
        
        for(int i=0; i<input.length ;i++) {
        	input[i] = scanner.nextInt();
        }
       
        int count = 0;
        for(int j : chess) {
        	System.out.print(j - input[count] + " ");
        	count++;
        }
        
    }
}