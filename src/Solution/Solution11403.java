package Solution;

import java.util.Scanner;
import java.util.Stack;

public class Solution11403 {	//경로찾기
	
	static int N;
	static int[][] matrix;
	static int[][] connect;
	
	public static void dfs() {

		for(int i=0; i<N; i++) {
			Stack<Integer> stack = new Stack<Integer>();
			stack.push(i);

			while(!stack.isEmpty()) {
				int node = stack.peek();
				boolean flag = false;
				for (int j = 0; j < N; j++) {
					if (matrix[node][j] == 1 && connect[i][j] == 0) {
						stack.push(j);
						connect[i][j] = 1;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		matrix=new int[N][N];
		connect=new int[N][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				connect[i][j]=0;
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		
		dfs();
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(connect[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
