package Solution;

import java.util.Scanner;
import java.util.Stack;

public class Solution2606 { //바이러스

    static int[][] arr;
    static boolean[] visited;
    static int cnt = 0;
    
    public static void dfs(int dfsNode) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        visited[1] = true;
        while (!s.isEmpty()) {
            boolean flag = false;
            int node = s.peek();
            for (int i = 1; i <= dfsNode; i++) {
                if (arr[node][i] == 1 && visited[i] == false) {
                    cnt++;
                    s.push(i);
                    visited[i] = true;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                s.pop();
            }
        }
        System.out.println(cnt);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        arr = new int[101][101];
        visited = new boolean[101];
        for(int p = 0; p < P; p++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x][y] = arr[y][x] = 1;
        }
        
        dfs(N);
        
        sc.close();
    }
}
