package Solution;

import java.util.Scanner;

public class Solution11720 {    //숫자의 합

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        
        int total = 0;
        for(int i = 0; i < n; i++) {
            total = total + (input.charAt(i) - '0');
        }
        System.out.println(total);
        
        sc.close();
    }

}
