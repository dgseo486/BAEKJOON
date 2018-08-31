package Solution;

import java.util.Scanner;

public class Solution2908 { //상수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        
        String readA = new String();
        String readB = new String();
        for(int i = 2; i >= 0; i--) {
            readA += A.charAt(i);
            readB += B.charAt(i);
        }
        
        if(Integer.parseInt(readA) > Integer.parseInt(readB)) {
            System.out.println(readA);
        } else {
            System.out.println(readB);
        }
        
        sc.close();
    }

}
