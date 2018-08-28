package Solution;

import java.util.Scanner;

public class Solution2448 { //별찍기 - 11

    static void printStar(int line) {
        int n = line;
        int h = 3;
        
        String[] star = new String[n];
        star[0] = "  *  ";
        star[1] = " * * ";
        star[2] = "*****";
        
        for(int k = 0; 3 * Math.pow(2, k) < n; k++) {
            for(int j = 0; j < h; j++) {
                star[h + j] = star[j] + " " + star[j];
                for(int m = 0; m < (h / 3); m++) {
                    star[j] = "   " + star[j] + "   ";
                }
            }
            h = h * 2;
        }
        for(int i = 0; i < h; i++) {
            System.out.println(star[i]);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        printStar(n);
    }

}
