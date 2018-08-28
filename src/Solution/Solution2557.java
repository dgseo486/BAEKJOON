package Solution;

import java.util.Scanner;

public class Solution2557 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();
        
        int result = A * B * C;
        int[] counts = new int[10];
        while(result > 0) {
            counts[result % 10]++;
            result /= 10;
        }
        
        for(int i = 0; i < 10; i++) {
            System.out.println(counts[i]);
        }
        
    }

}
