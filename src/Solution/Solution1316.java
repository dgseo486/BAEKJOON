package Solution;

import java.util.Scanner;

public class Solution1316 { //그룹 단어 체커

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = N;
        for(int tc = 0; tc < N; tc++) {
            String word = sc.next();
            boolean[] check = new boolean[26];
            for(int i = 1; i < word.length(); i++) {
                if(word.charAt(i - 1) != word.charAt(i)) {
                    if(check[word.charAt(i) - 97] == true) {
                        ans--;
                        break;
                    }
                    check[word.charAt(i - 1) - 97] = true;
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
