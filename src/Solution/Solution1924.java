package Solution;

import java.util.Scanner;

public class Solution1924 { // 2007년
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        sc.close();
        
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weeks = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        int totalDays = day;
        for(int i = 0; i < month - 1; i++) {
            totalDays = totalDays + months[i];
        }
        
        System.out.println(weeks[totalDays % 7]);
    }
}
