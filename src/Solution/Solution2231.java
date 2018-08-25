package Solution;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution2231 {
    //N의 가장 작은 생성자를 구하는 구하는 것.
    public static void main(String[] args) throws NumberFormatException, IOException {
       //생성자..
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
       int N = Integer.parseInt(br.readLine());
       for(int i=1; i<=1000000; i++) {
          if(calcul(i)==N) {
             bw.write(i+"");
             break;
          }
       }
       bw.flush();
    }
    public static int calcul(int n) {
       int sum = n;
       while(n!=0) {
          sum += n%10;
          n /= 10;
       }
       return sum;
    }
}