package Solution;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1026 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        
        int[] arr2 = new int[n];
        for(int j = 0; j < n; j++) {
            arr2[j] = sc.nextInt();
        }
        
        Arrays.sort(arr1);
        
        Arrays.sort(arr2);
        int[] sortedArr2 = new int[n];
        int k = 0;
        for(int i = n - 1; i >= 0; i--) {
            sortedArr2[k] = arr2[i];
            k++;
        }
        
        int result = 0;
        for(int i = 0; i < n; i++) {
            result = result + (arr1[i] * sortedArr2[i]);
        }
        
        System.out.println(result);
        
        sc.close();
    }

}
