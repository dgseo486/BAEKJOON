package Solution;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution7576 { //토마토
    static int M, N;
    static int[][] arr;
    static boolean[][] visit;
    static int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    static Queue<ripenTomato> q = new LinkedList<>(); 
    
    static void bfs(int x, int y) {
        visit[y][x] = true;
        while(!q.isEmpty()) {
            ripenTomato pos = q.poll();
            for(int i = 0; i < 4; i++) {
                int nextX = pos.x + dir[i][0];
                int nextY = pos.y + dir[i][1];
                if(nextX < 0 || nextY < 0 || nextX >= M || nextY >= N) {
                    continue;
                }
                if(arr[nextY][nextX] != 0) {
                    continue;
                }
                arr[nextY][nextX] = arr[pos.y][pos.x] + 1;
                q.offer(new ripenTomato(nextX, nextY));
            }
        }
        
        int max = 0;
        for(int n = 0; n < N; n++) {
            for(int m = 0; m < M; m++) {
                if(arr[n][m] == 0) {
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, arr[n][m]);
            }
        }
        System.out.println(max - 1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        arr = new int[N][M];
        visit = new boolean[N][M];
        for(int n = 0; n < N; n++) {
            for(int m = 0; m < M; m++) {
                arr[n][m] = sc.nextInt();
                if(arr[n][m] == 1) {
                    q.offer(new ripenTomato(m, n));
                }
            }
        }
        
        for(ripenTomato pos : q) {
            bfs(pos.x, pos.y);
        }
        
        sc.close();
    }

}

class ripenTomato{
    int x = 0, y = 0;
    public ripenTomato(int x, int y){
        this.x = x;
        this.y = y;
    }
}
