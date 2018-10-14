package Solution;

import java.util.Scanner;

public class Solution14620 {    //꽃길
    
    static int N;
    static int minCost = Integer.MAX_VALUE;
    static int[][] garden;
    static boolean[][] visited;
    
    public static boolean isPossible(int i, int j) {
        if((i + 1) >= N || (i - 1) < 0 || (j + 1) >= N || (j - 1) < 0) {
            return false;
        }
        if(visited[i][j] == true || visited[i + 1][j] == true || visited[i - 1][j] == true || visited[i][j + 1] == true || visited[i][j - 1] == true) {
            return false;
        }
        return true;
    }
    
    public static void dfs(int seed, int cost) {
        if(seed == 3) {
            minCost = Math.min(minCost, cost);
            return;
        } else {
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    if(isPossible(i, j)) {
                        visited[i][j] = visited[i + 1][j] = visited[i - 1][j] = visited[i][j + 1] = visited[i][j - 1] = true;
                        cost = cost + garden[i][j] + garden[i + 1][j] + garden[i - 1][j] + garden[i][j + 1] + garden[i][j - 1];
                        dfs(seed + 1, cost);
                        visited[i][j] = visited[i + 1][j] = visited[i - 1][j] = visited[i][j + 1] = visited[i][j - 1] = false;
                        cost = cost - garden[i][j] - garden[i + 1][j] - garden[i - 1][j] - garden[i][j + 1] - garden[i][j - 1];
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        garden = new int[N][N];
        visited = new boolean[N][N];
        
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                garden[i][j] = sc.nextInt();
            }
        }
        
        dfs(0 , 0);
        
        System.out.println(minCost);
        
        sc.close();
    }

}
