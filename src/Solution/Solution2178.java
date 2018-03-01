package Solution;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution2178 {	//미로찾기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[][] map = new int[N + 1][M + 1];
		boolean[][] visit = new boolean[N + 1][M + 1];
		int[][] dist = new int[N + 1][M + 1];
		int[][] dir = { { 0, -1 }, { 0, 1 }, { 1, 0 }, { -1, 0 } };

		for (int i = 1; i <= N; i++) {
			String line = sc.next();
			for (int j = 1; j <= M; j++) {
				map[i][j] = line.charAt(j - 1) - '0';
			}
		}

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				visit[i][j] = false;
			}
		}

		Queue<int[]> queue = new LinkedList<int[]>();
		queue.offer(new int[] { 1, 1 });
		visit[1][1] = true;
		dist[1][1] = 1;
		while (!queue.isEmpty()) {
			int[] nowPos = queue.poll();
			for (int i = 0; i < 4; i++) {
				int[] nextPos = { nowPos[0] + dir[i][0], nowPos[1] + dir[i][1] };
				if (nextPos[0] > 0 && nextPos[0] <= N && nextPos[1] > 0 && nextPos[1] <= M && map[nextPos[0]][nextPos[1]] == 1 && visit[nextPos[0]][nextPos[1]] == false) {
					queue.offer(nextPos);
					visit[nextPos[0]][nextPos[1]] = true;
					dist[nextPos[0]][nextPos[1]] = dist[nowPos[0]][nowPos[1]] + 1;
				}
			}
		}

		System.out.print(dist[N][M]);

		sc.close();
	}

}