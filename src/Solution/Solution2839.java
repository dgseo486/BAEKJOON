package Solution;

import java.util.Scanner;

public class Solution2839 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int five = 0;
        int three = 0;
        
        while(N % 5 != 0 && N >= 0) {
            N -= 3;
            three++;
        }
        
        if(N < 0) {
            System.out.println(-1);
        } else {
            five = N / 5;
            System.out.println(five + three);
        }
        
        sc.close();
    }

}
