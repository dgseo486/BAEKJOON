package Solution;

import java.util.Scanner;

public class Solution1110 { //더하기 싸이클

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = 1;
        int check = input;
        while(true) {
            int A = input / 10;
            int B = input % 10;
            int C = A + B;
            input = (B * 10) + (C % 10);
            
            if(check == input) {
                break;
            } else {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }

}
