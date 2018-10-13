package Solution;

import java.util.Scanner;

public class Solution5162 { //두가지 빵의 딜레마

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] result = new int[T];
        for(int tc = 0; tc < T; tc++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int bread =  0;
            
            int min = Math.min(A, B);
            bread += C / min;
            C -= min * (C / min);
            
            int max = Math.max(A, B);
            bread += C / max;
            
            result[tc] = bread;
        }
        
        for(int tc = 0; tc < T; tc++) {
            System.out.println("#" + (tc + 1) + " " + result[tc]);
        }
        
        sc.close();
    }

}
