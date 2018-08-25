package Solution;

import java.util.Scanner;

public class Solution11721 {    //열개씩 끊어 출력하기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        int count = 0;
        for(int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i));
            count++;
            if(count % 10 == 0 && count > 1) {
                System.out.println();
            }
        }
        sc.close();
    }

}
