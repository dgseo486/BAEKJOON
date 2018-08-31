package Solution;

import java.util.Scanner;

public class Solution2941 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
        String[] table = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for(int i = 0; i < 8; i++) {
            input = input.replaceAll(table[i], "a");
        }
        System.out.println(input.length());
    }

}
