package Solution;

import java.util.Scanner;

public class Solution8958 { //OX퀴즈

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        sc.nextLine();
        
        String[] scores = new String[tc];
        for(int t = 0; t < tc; t++) {
            scores[t] = sc.nextLine();
        }
        sc.close();
        
        for(int i = 0; i < tc; i++) {
            int sum = 0;
            int count = 0;
            for(int j = 0; j < scores[i].length(); j++) {
                if(scores[i].charAt(j) == 'O') {
                    count++;
                    sum = sum + count;
                } else {
                    count = 0;
                }
            }
            System.out.println(sum);
        }
    }

}
