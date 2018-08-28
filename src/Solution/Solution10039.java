package Solution;

import java.util.Scanner;

public class Solution10039 {    //평균 점수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];
        for(int i = 0; i < 5; i++) {
            scores[i] = sc.nextInt();
            if(scores[i] < 40) {
                scores[i] = 40;
            }
        }
        sc.close();
        
        int total = 0;
        for(int i = 0; i < 5; i++) {
            total += scores[i];
        }
        System.out.println(total / 5);
    }

}
