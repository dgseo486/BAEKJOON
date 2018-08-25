package Solution;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Solution1181 { // 단어 정렬
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        TreeSet<String> set = new TreeSet<>(); // TreeSet은 자동으로 알파벳 순서로 정렬한다.
        for(int tc = 0; tc < n; tc++) {
            set.add(sc.nextLine());
        }
        
        String[] arr = new String[set.size()];
        set.toArray(arr);  //set을 array로 바꾼다.
        
        Arrays.sort(arr, new Comparator<String>() {  // 길이 순서로 정렬
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) {
                    return 1;
                } else if(o1.length() < o2.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        
        for(String str : arr) {
            System.out.println(str);
        }
        
        sc.close();
    }
}
