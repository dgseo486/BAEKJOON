package Solution;

import java.util.Arrays;
import java.util.Scanner;

public class Solution10817 {    //세 수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] value = new int[3];
        for(int i = 0; i < 3; i++) {
            value[i] = sc.nextInt();
        }
        
        Arrays.sort(value);
        
        System.out.println(value[1]);
        
        sc.close();
    }

}
