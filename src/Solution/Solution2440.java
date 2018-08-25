package Solution;

import java.util.Scanner;

public class Solution2440 { // 별찍기 - 3

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for(int i = N; i > 0; i--) {
            for(int j = N - i; j < N; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
    }

}
