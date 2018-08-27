package Solution;

public class Solution4673 {
    
    static int num[] = new int[10100];
    
    static int d(int n) {
        int res = n;
        if(n >= 10000) {
            res += n / 10000;
            n %= 10000;
        }
        if(n >= 1000) {
            res += n / 1000;
            n %= 1000;
        }
        if(n >= 100) {
            res += n / 100;
            n %= 100;
        }
        if(n >= 10) {
            res += n / 10;
            n %= 10;
        }
        return res += n;
    }
    
    public static void main(String[] args) {
        for(int i = 1; i <= 10000; i++) {
            num[d(i)] = 1;
        }
        
        for(int i = 1; i <= 10000; i++) {
            if(num[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
