package Solution;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Solution1260_2 { // DFS와 BFS

    static int[][] map;
    static boolean[] visited;
    static int N, M, V;

    public static void dfs(int StartNode) {
        Stack<Integer> stack = new Stack<>();
        stack.push(StartNode);
        visited[StartNode] = true;
        System.out.printf("%d ", StartNode);
        while(!stack.isEmpty()) {
            boolean flag = false;
            int node = stack.peek();
            for(int i = 1; i <= N; i++) {
                if(map[node][i] == 1 && visited[i] == false) {
                    stack.push(i);
                    visited[i] = true;
                    System.out.printf("%d ", i);
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                stack.pop();
            }
        }
    }

    public static void bfs(int StartNode) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(StartNode);
        visited[StartNode] = true;
        System.out.printf("%d ", StartNode);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int i = 1; i <= N; i++) {
                if (map[node][i] == 1 && visited[i] == false) {
                    queue.offer(i);
                    visited[i] = true;
                    System.out.printf("%d ", i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        V = sc.nextInt();

        map = new int[N + 1][N + 1];
        visited = new boolean[(N + 1) * (N + 1)];

        for (int i = 0; i < M; i++) {
            int I = sc.nextInt();
            int J = sc.nextInt();
            map[I][J] = 1;
            map[J][I] = 1;
        }

        dfs(V);

        for (int i = 0; i < (N * N); i++) {
            visited[i] = false;
        }
        System.out.println();
        
        bfs(V);

        sc.close();
    }
}