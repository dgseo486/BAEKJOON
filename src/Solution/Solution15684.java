package Solution;

import java.util.Scanner;

public class Solution15684 {    //사다리 조작
    
    static int N, M, H, ans = Integer.MAX_VALUE;
    static int[][] map;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        H = sc.nextInt();
        map = new int[H + 1][N + 1];
        for(int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a][b] = 1;
        }
        
        dfs(1, 1, 0);
        
        if(ans > 3) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
        
        sc.close();
    }
    
    public static void dfs(int i, int j, int cnt) {
        if(cnt > 3) {
            return;
        }
        
        if(chk()) {
            if(cnt < ans) {
                ans = cnt;
            }
            return;
        }
        
        for(int h = i; h <= H; h++) {
            j = 1;
            for(int n = j; n < N; n++) {
                if(map[h][n] == 1) {
                    n++;
                    continue;
                }
                map[h][n] = 1;
                dfs(h, n + 2, cnt + 1);
                map[h][n] = 0;
            }
        }
    }
    
    public static boolean chk() {
        for(int j = 1; j <= N; j++) {
            int pos = j;
            for(int i = 1; i <= H; i++) {
                if(map[i][pos] == 1) {
                    pos++;
                } else if(map[i][pos - 1] == 1) {
                    pos--;
                }
            }
            if(j != pos) {
                return false;
            }
        }
        return true;
    }
}
