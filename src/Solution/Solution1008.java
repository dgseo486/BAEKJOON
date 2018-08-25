package Solution;

import java.util.Scanner;

public class Solution1008 { // A/B

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextInt();
        double B = sc.nextInt();
        System.out.printf("%.9f", A / B);
        sc.close();
    }

}