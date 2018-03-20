package Solution;

import java.util.Scanner;

public class Solution2583 {
    static int M = 0;
    static int N = 0;
    static int K = 0;
    static int[][] matrix;
    static boolean[][] visit;
    static int[] area;
    static int count = 0;

    static void dfs(int i, int j) {
        visit[i][j] = true;
        area[count]++;
        int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        for (int d = 0; d < 4; d++) {
            int nextI = i + dir[d][0];
            int nextJ = j + dir[d][1];
            if (nextI >= 0 && nextI < M && nextJ >= 0 && nextJ < N) {
                if (matrix[nextI][nextJ] == 1 && visit[nextI][nextJ] == false) {
                    dfs(nextI, nextJ);
                }
            }
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        K = sc.nextInt();

        matrix = new int[M][N];
        visit = new boolean[M][N];
        area = new int[M * N];

        int[][] temp = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                temp[i][j] = 1;
            }
        }

        int[][] block = new int[K][4];
        for (int i = 0; i < K; i++) {
            block[i][0] = sc.nextInt();
            block[i][1] = sc.nextInt();
            block[i][2] = sc.nextInt();
            block[i][3] = sc.nextInt();
        }

        for (int k = 0; k < K; k++) {
            for (int i = block[k][1]; i < block[k][3]; i++) {
                for (int j = block[k][0]; j < block[k][2]; j++) {
                    temp[i][j] = 0;
                }
            }
        }

        int i2 = 0;
        for (int i = M - 1; i >= 0; i--) {
            int j2 = 0;
            for (int j = 0; j < N; j++) {
                matrix[i2][j2] = temp[i][j];
                j2++;
            }
            i2++;
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == 1 && visit[i][j] == false) {
                    dfs(i, j);
                    count++;
                }
            }
        }

        System.out.println(count);
        for (int i = 0; i < M * N; i++) {
            if (area[i] > 0) {
                System.out.print(area[i] + " ");
            }
        }

    }
}