package Solution;

import java.util.Scanner;

public class Solution5622 { //다이얼

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        sc.close();
        int[] table = {3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 
                       7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};
        int time = 0;
        for(int i = 0; i < number.length(); i++) {
            time += table[number.charAt(i) - 65];
        }
        System.out.println(time);
    }

}
