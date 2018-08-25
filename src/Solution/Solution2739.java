package Solution;

import java.util.Scanner;

public class Solution2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        switch (n) {
        case 1:
            for(int i = 1; i <= 9; i++) {
                System.out.println("1 * " + i + " = " + (1 * i));
            }
            break;
            
        case 2:
            for(int i = 1; i <= 9; i++) {
                System.out.println("2 * " + i + " = " + (2 * i));
            }
            break;
            
        case 3:
            for(int i = 1; i <= 9; i++) {
                System.out.println("3 * " + i + " = " + (3 * i));
            }
            break;
            
        case 4:
            for(int i = 1; i <= 9; i++) {
                System.out.println("4 * " + i + " = " + (4 * i));
            }
            break;
            
        case 5:
            for(int i = 1; i <= 9; i++) {
                System.out.println("5 * " + i + " = " + (5 * i));
            }
            break;
        
        case 6:
            for(int i = 1; i <= 9; i++) {
                System.out.println("6 * " + i + " = " + (6 * i));
            }
            break;
            
        case 7:
            for(int i = 1; i <= 9; i++) {
                System.out.println("7 * " + i + " = " + (7 * i));
            }
            break;
            
        case 8:
            for(int i = 1; i <= 9; i++) {
                System.out.println("8 * " + i + " = " + (8 * i));
            }
            break;
            
        case 9:
            for(int i = 1; i <= 9; i++) {
                System.out.println("9 * " + i + " = " + (9 * i));
            }
            break;

        default:
            break;
        }
        
        sc.close();
    }
}
