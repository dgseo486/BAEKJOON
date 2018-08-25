package Solution;

import java.util.Scanner;

public class Solution1912 { // 연속합
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        int[] temp = new int[n];
        int max = 0;
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        temp[0] = arr[0];
        max = arr[0];
        
        for(int i = 1; i < n; i++) {
            temp[i] = Math.max(arr[i], arr[i] + temp[i - 1]);
            max = Math.max(max, temp[i]);
        }
        
        System.out.println(max);
        
        sc.close();
    }
}

/*  예)
 *  arr  10 -4  3  1  5  6 -35 12 21 -1
 * temp  10  6  9 10 15 21 -14 12 33 32
 * 
 * arr에서 현재 값과 현재 값 + 이전 값 중에 큰 값을 temp에 저장한다.
 */
