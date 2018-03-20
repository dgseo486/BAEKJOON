package Solution;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Solution2667 { // 단지번호붙이기

	static int N = 0;
	static int cluster = 0;

	public static void dfs(int[][] m, boolean[][] v, int c) {
		Stack<int[]> stack = new Stack<int[]>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (m[i][j] == 1 && v[i][j] == false) {
					c++;
					m[i][j] = c;
					v[i][j] = true;
					stack.push(new int[] { i, j });
					while (!stack.isEmpty()) {
						boolean flag = false;
						int[] nowPos = stack.peek();
						int[][] dir = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
						for (int k = 0; k < 4; k++) {
							int[] nextPos = { nowPos[0] + dir[k][0], nowPos[1] + dir[k][1] };
							if (nextPos[0] >= 0 && nextPos[0] < N && nextPos[1] >= 0 && nextPos[1] < N
									&& m[nextPos[0]][nextPos[1]] == 1 && v[nextPos[0]][nextPos[1]] == false) {
								stack.push(nextPos);
								m[nextPos[0]][nextPos[1]] = c;
								v[nextPos[0]][nextPos[1]] = true;
								flag = true;
								break;
							}
						}
						if (!flag) {
							stack.pop();
						}
					}
				}
			}
		}
		cluster = c;
	}

	public static void count(int[][] m, int[] o) {
		for (int i = 1; i <= N * N; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					if (m[j][k] == i) {
						o[i] = o[i] + 1;
					}
				}
			}
		}
		Arrays.sort(o);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		int[][] map = new int[N][N];
		boolean[][] visited = new boolean[N][N];

		for (int i = 0; i < N; i++) {
			String line = sc.next();
			for (int j = 0; j < N; j++) {
				map[i][j] = line.charAt(j) - '0';
			}
		}

		dfs(map, visited, cluster);

		System.out.println(cluster);

		int[] object = new int[N * N];
		count(map, object);

		for (int i = 0; i < N * N; i++) {
			if (object[i] > 0) {
				System.out.println(object[i]);
			}
		}

	}

}
