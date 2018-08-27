package Solution;

import java.util.Scanner;

public class Solution1065 { //한수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int count = 0;
        for(int i = 1; i <= N; i++) {
            if(i > 0 && i < 100) {
                count++;
            } else if(i == 1000) {
                break;
            } else {
                int k = i;
                int[] arr = new int[3];
                int index = 0;
                while(k > 0) {
                    arr[index] = k % 10;
                    k /= 10;
                    index++;
                }
                if((arr[0] - arr[1]) == (arr[1] - arr[2])) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
        sc.close();
    }

}
