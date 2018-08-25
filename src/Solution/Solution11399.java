package Solution;

import java.util.Arrays;
import java.util.Scanner;

public class Solution11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] time = new int[n];
        for(int i = 0 ; i < n; i++) {
            time[i] = sc.nextInt();
        }
        
        Arrays.sort(time);
        
        /*for(int i = 0; i < n; i++) {
            System.out.print(time[i] + " ");
        }
        
        System.out.println();*/
        
        int result = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i + 1; j++) {
                result = result + time[j];
            }
        }
        
        System.out.println(result);
        
        sc.close();
    }
}
