package Solution;

import java.util.Scanner;

public class Solution2292 { //벌집
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int result = 1;
        int floor = 1;
        int addnum = 6;
        while(true) {
            if(n <= floor) {
                break;
            }
            floor = floor + addnum;
            addnum = addnum + 6;
            result++;
        }
        System.out.println(result);
        
        sc.close();
    }
}
