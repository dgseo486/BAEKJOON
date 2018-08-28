package Solution;

import java.util.Arrays;
import java.util.Scanner;

public class Solution10809 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();
        
        int[] table = new int[26];
        Arrays.fill(table, -1);
        
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == 'a' && table[0] == -1) {
                table[0] = i;
            } else if(S.charAt(i) == 'b' && table[1] == -1) {
                table[1] = i;
            } else if(S.charAt(i) == 'c' && table[2] == -1) {
                table[2] = i;
            } else if(S.charAt(i) == 'd' && table[3] == -1) {
                table[3] = i;
            } else if(S.charAt(i) == 'e' && table[4] == -1) {
                table[4] = i;
            } else if(S.charAt(i) == 'f' && table[5] == -1) {
                table[5] = i;
            } else if(S.charAt(i) == 'g' && table[6] == -1) {
                table[6] = i;
            } else if(S.charAt(i) == 'h' && table[7] == -1) {
                table[7] = i;
            } else if(S.charAt(i) == 'i' && table[8] == -1) {
                table[8] = i;
            } else if(S.charAt(i) == 'j' && table[9] == -1) {
                table[9] = i;
            } else if(S.charAt(i) == 'k' && table[10] == -1) {
                table[10] = i;
            } else if(S.charAt(i) == 'l' && table[11] == -1) {
                table[11] = i;
            } else if(S.charAt(i) == 'm' && table[12] == -1) {
                table[12] = i;
            } else if(S.charAt(i) == 'n' && table[13] == -1) {
                table[13] = i;
            } else if(S.charAt(i) == 'o' && table[14] == -1) {
                table[14] = i;
            } else if(S.charAt(i) == 'p' && table[15] == -1) {
                table[15] = i;
            } else if(S.charAt(i) == 'q' && table[16] == -1) {
                table[16] = i;
            } else if(S.charAt(i) == 'r' && table[17] == -1) {
                table[17] = i;
            } else if(S.charAt(i) == 's' && table[18] == -1) {
                table[18] = i;
            } else if(S.charAt(i) == 't' && table[19] == -1) {
                table[19] = i;
            } else if(S.charAt(i) == 'u' && table[20] == -1) {
                table[20] = i;
            } else if(S.charAt(i) == 'v' && table[21] == -1) {
                table[21] = i;
            } else if(S.charAt(i) == 'w' && table[22] == -1) {
                table[22] = i;
            } else if(S.charAt(i) == 'x' && table[23] == -1) {
                table[23] = i;
            } else if(S.charAt(i) == 'y' && table[24] == -1) {
                table[24] = i;
            } else if(S.charAt(i) == 'z' && table[25] == -1) {
                table[25] = i;
            }
        }
        
        for(int value : table) {
            System.out.print(value + " ");
        }
    }

}
