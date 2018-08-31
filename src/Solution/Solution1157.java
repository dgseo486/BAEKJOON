package Solution;

import java.util.Scanner;

public class Solution1157 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        sc.close();
        
        int[] counts = new int[26];
        for(int i = 0; i < str.length(); i++) {
            int index = (int)str.charAt(i);
            counts[index - 65]++;
        }
        
        int max = -1;
        char ans = ' ';
        for(int i = 0; i < 26; i++) {
            if(max < counts[i]) {
                max = counts[i];
                ans = (char)(i + 65);
            } else if(max == counts[i]) {
                ans = '?';
            }
        }
        System.out.println(ans);
    }

}
