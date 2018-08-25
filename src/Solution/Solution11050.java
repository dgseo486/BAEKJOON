package Solution;

import java.util.Scanner;

public class Solution11050 {
    
    static int factorial(int n) {
        if(n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int result = factorial(N) / (factorial(K) * factorial(N - K));
        
        System.out.println(result);
        
        sc.close();
        
        
        
    }
}
