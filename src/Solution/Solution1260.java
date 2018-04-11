package Solution;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Solution1260 { // DFS와 BFS

    static int edgeArr[][];
    static boolean visited[];
    static int node, edge, start;

    public static void bfs(int bfsNode, int bfsEdge, int bfsStart) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(bfsStart);
        visited[bfsStart] = true;
        System.out.print(bfsStart + " ");
        while (!q.isEmpty()) {
            int node = q.poll();
            for (int i = 1; i <= bfsNode; i++) {
                if (edgeArr[node][i] == 1 && visited[i] == false) {
                    q.offer(i);
                    System.out.print(i + " ");
                    visited[i] = true;
                }
            }
        }
    }

    public static void dfs(int dfsNode, int dfsEdge, int dfsStart) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(dfsStart);
        visited[dfsStart] = true;
        System.out.print(dfsStart + " ");
        while (!s.isEmpty()) {
            boolean flag = false;
            int node = s.peek();
            for (int i = 1; i <= dfsNode; i++) {
                if (edgeArr[node][i] == 1 && visited[i] == false) {
                    s.push(i);
                    System.out.print(i + " ");
                    visited[i] = true;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                s.pop();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Node Edge Start");
        node = sc.nextInt();
        edge = sc.nextInt();
        start = sc.nextInt();

        visited = new boolean[10001];
        edgeArr = new int[1001][1001];

        for (int i = 0; i < edge; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            edgeArr[x][y] = edgeArr[y][x] = 1;
        }

        dfs(node, edge, start);

        for (int j = 1; j <= node; j++) {
            visited[j] = false;
        }
        System.out.println();

        bfs(node, edge, start);

    }
}