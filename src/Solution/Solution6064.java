package Solution;

import java.util.Scanner;

public class Solution6064 {

    static int lcm(int m, int n) {
        int a = m;
        int b = n;
        int temp = 0;
        while(b > 0) {
            temp = a;
            a = b;
            b = temp % b;
            System.out.println(b);
        }
        return (m * n) / a;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc = 0; tc < T;  tc++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            
        }
        
        sc.close();
    }

}
