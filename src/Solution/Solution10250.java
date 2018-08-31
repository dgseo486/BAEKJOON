package Solution;

import java.util.Scanner;

public class Solution10250 {    //ACM 호텔

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] roomNo = new int[T];
        for(int tc = 0; tc < T; tc++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int floor = 0;
            int number = 0;
            if(N % H != 0) {
                number = (N / H) + 1;
                floor = N % H;
                roomNo[tc] = (floor * 100) + number;
            } else {
                number = N / H;
                roomNo[tc] = (H * 100) + number;
            }
        }
        
        for(int i = 0; i < T; i++) {
            System.out.println(roomNo[i]);
        }
        
        sc.close();
    }

}
