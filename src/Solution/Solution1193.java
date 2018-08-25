package Solution;

import java.util.Scanner;

public class Solution1193 { //1193 분수찾기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        int i = 0;
        int max = 0;
        
        while(max < x) {
            i++;
            max = i * (i + 1) / 2;
        }
        
        if(i % 2 != 0) { // 홀수
            int top = 1 + (max - x);
            int bottom = i - (max - x);
            System.out.println(top + "/" + bottom);
        } else { // 짝수
            int top = i - (max - x);
            int bottom = 1 + (max - x);
            System.out.println(top + "/" + bottom);
        }
        
        sc.close();
    }
}
