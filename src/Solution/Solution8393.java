package Solution;

import java.util.Scanner;

public class Solution8393 { //합

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int total = 0;
        for(int i = 1; i <= n; i++) {
            total = total + i;
        }
        System.out.println(total);
    }

}
