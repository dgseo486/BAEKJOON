package Solution;

import java.util.Scanner;

public class Solution2920 { //음계

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for(int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        int count = 0;
        for(int i = 1; i <= 7; i++) {
            if(arr[i] - arr[i - 1] == 1) {
                count++;
            } else if(arr[i] - arr[i - 1] == -1) {
                count--;
            }
        }
        
        if(count == 7) {
            System.out.println("ascending");
        } else if(count == -7) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }

}
