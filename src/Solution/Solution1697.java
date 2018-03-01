package Solution;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution1697 {	//¼û¹Ù²ÀÁú

	static int[] sec = new int[100001];
	static boolean[] visit = new boolean[100001];

	public static void bfs(int start, int end) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(start);
		visit[start] = true;
		while (!queue.isEmpty() && start!=end) {
			int nowPos = queue.poll();
			if (nowPos == end) {
				break;
			}
			int[] dir = { 1, -1, nowPos };
			for (int i = 0; i < 3; i++) {
				int nextPos = nowPos + dir[i];
				if (nextPos>=0 && nextPos<=100000 && visit[nextPos] == false) {
					visit[nextPos] = true;
					queue.offer(nextPos);
					sec[nextPos]=sec[nowPos]+1;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		bfs(N, K);

		System.out.println(sec[K]);
	}

}