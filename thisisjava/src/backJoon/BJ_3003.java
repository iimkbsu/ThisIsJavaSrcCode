package backJoon;

import java.io.IOException;
import java.util.Scanner;

public class BJ_3003 {

    public static void main(String[] args) throws IOException {
        //input
        Scanner scanner = new Scanner(System.in);
        
        int[] cnt = new int[6];
        int[] full = {1, 1, 2, 2, 2, 8};
        
        for (int i = 0; i < cnt.length; i++) {
            cnt[i] = scanner.nextInt();
        }

        for (int i = 0; i < full.length; i++) {
            cnt[i] = full[i] - cnt[i];
            System.out.print(cnt[i] + " ");
        }
    }
}
