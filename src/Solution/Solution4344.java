package Solution;

import java.util.Scanner;

public class Solution4344 {     //평균은 넘겠지

    static int[] scores;
    static double avg;
    static double count;
    
    public static double average(int[] arr) { //평균 구하는 메소드
        double total = 0.0;
        for(int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total / arr.length;
    }
    
    public static double count(double value) { //평균 넘은 사람 계산 메소드
        int count = 0;
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] > value) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        double[] result = new double[C];
        
        for(int i = 0; i < C; i++) {
            int N = sc.nextInt();
            scores = new int[N];
            for(int j = 0; j < N; j++) {
                scores[j] = sc.nextInt();
            }
            avg = average(scores);
            count = count(avg);
            
            result[i] = count / N * 100;
        }
        
        for(int i = 0; i < C; i++) {
            System.out.printf("%.3f", result[i]);
            System.out.print("%");
            System.out.println();
        }
        
        sc.close();
    }

}
