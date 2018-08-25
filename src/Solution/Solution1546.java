package Solution;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1546 { //평균
    
    public static double average(double[] numbers) {
        double total = 0;
        for(int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total / numbers.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        double[] arr = new double[T];
        for(int i = 0; i < T; i++) {
            arr[i] = sc.nextInt();
        }
        double avg = average(arr);  // 평균을 구한다.
        Arrays.sort(arr);   //최댓값을 구하기 위해 정렬한다.
        System.out.printf("%.2f", avg / arr[T - 1] * 100);  //소수 둘째 자리까지 출력
        sc.close();
    }

}
