package Solution;

import java.util.Scanner;

public class Solution1012 {
	
	static int N = 0;
	static int M = 0;
	static int[][] matrix;
	static boolean[][] visit;

	public static void dfs(int currentX, int currentY) {
		int[][] dir = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

		visit[currentX][currentY] = true;

		for (int i = 0; i < 4; i++) {
			int[] nextPos = { currentX + dir[i][0], currentY + dir[i][1] };
			if (nextPos[0] >= 0 && nextPos[0] < N && nextPos[1] >= 0 && nextPos[1] < M) {
				if (matrix[nextPos[0]][nextPos[1]] == 1 && visit[nextPos[0]][nextPos[1]] == false) {
					dfs(nextPos[0], nextPos[1]);
				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			M = sc.nextInt();
			N = sc.nextInt();
			matrix = new int[N][M];
			visit = new boolean[N][M];

			int K = sc.nextInt();
			for (int i = 0; i < K; i++) {
				int Y = sc.nextInt();
				int X = sc.nextInt();
				matrix[X][Y] = 1;
			}
			
			int cnt=0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (matrix[i][j] == 1 && visit[i][j] == false) {
						dfs(i, j);
						cnt++;
					}
				}
			}

			System.out.println(cnt);
		}
	}

}
