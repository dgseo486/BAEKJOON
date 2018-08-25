package Solution;

import java.util.Scanner;

public class Solution2750 { // 수 정렬하기 1 - 버블정렬

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] value = new int[n];
        for(int test_case = 0; test_case < n; test_case++) {
            value[test_case] = sc.nextInt();
        }
        
        int temp = 0;
        for(int i = value.length; i > 0; i--) {
            for(int j = 0; j < i - 1; j++) {
                if(value[j] > value[j + 1]) {
                    temp = value[j];
                    value[j] = value[j + 1];
                    value[j + 1] = temp;
                }
            }
        }
        
        for(int i = 0; i < n; i++) {
            System.out.println(value[i]);
        }
        sc.close();
    }

}
