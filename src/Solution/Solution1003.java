package Solution;

import java.util.Scanner;

public class Solution1003 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[][] arr = new int[41][2];
        arr[0][0] = 1;
        arr[1][1] = 1;
        
        for(int i = 2; i < 41; i++) {
            for(int j = 0; j < 2; j++) {
                arr[i][j] = arr[i-2][j] + arr[i-1][j];
            }
        }
        
        int[] input = new int[T];
        for(int i = 0; i < T; i++) {
            input[i] = sc.nextInt();
        }
        
        for(int j = 0; j < T; j++) {
            System.out.println(arr[input[j]][0]+ " " + arr[input[j]][1]);
        }
        
        sc.close();
    }
}