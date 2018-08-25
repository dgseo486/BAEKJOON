package Solution;

import java.util.Scanner;

public class Solution2775 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        int[] result = new int[T];
        for(int test_case = 0; test_case < T; test_case++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            
            int[] floor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
            
            for(int i = 0; i < k; i++) {
                int sum = 0;
                for(int j = 0; j < n; j++) {
                    sum = sum + floor[j];
                    floor[j] = sum;
                }
            }
            result[test_case] = floor[n-1];
        }
        
        for(int k = 0; k < T; k++) {
            System.out.println(result[k]);
        }
        
        sc.close();
    }

}
