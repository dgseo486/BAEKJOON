package Solution;

import java.util.Scanner;

public class Solution1475 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roomNumber = sc.nextLine();
        sc.close();
        
        int[] set = new int[10];
        for(int i = 0; i < roomNumber.length(); i++) {
            set[roomNumber.charAt(i) - '0']++;
        }
        
        int temp = set[6] + set[9];
        if(temp % 2 == 0) {
            set[6] = temp / 2;
            set[9] = temp / 2;
        } else {
            set[6] = temp / 2 + 1;
            set[9] = temp / 2 + 1;
        }
        
        int max = 0;
        for(int i = 0; i < 10; i++) {
            max = Math.max(max, set[i]);
        }
        System.out.println(max);
    }

}
