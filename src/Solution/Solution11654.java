package Solution;

import java.util.Scanner;

public class Solution11654 {    //아스키코드

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char character = sc.nextLine().charAt(0);
        sc.close();
        System.out.println(Integer.valueOf(character));
    }

}
