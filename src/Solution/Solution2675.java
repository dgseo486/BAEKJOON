package Solution;

import java.util.Scanner;

public class Solution2675 { //문자열 반복

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        int[] R = new int[T];
        String[] S = new String[T];
        String[] output = new String[T];
        for(int i = 0; i < T; i++) {
            output[i] = "";
        }
        for(int tc = 0; tc < T; tc++) {
            R[tc] = sc.nextInt();
            S[tc] = sc.next();
            for(int i = 0; i < S[tc].length(); i++) {
                for(int j = 0; j < R[tc]; j++) {
                    output[tc] += S[tc].charAt(i);
                }
            }
        }
        for(int i = 0; i < T; i++) {
            System.out.println(output[i]);
        }
        sc.close();
    }

}
