package Solution;

import java.util.Scanner;

public class Solution2747 { //피보나치의 수

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] arr=new int[n+1];
		for(int i=0; i<=n; i++) {
			if(i==0) {
				arr[i]=0;
			}else if(i==1) {
				arr[i]=1;
			}else {
				arr[i]=arr[i-2]+arr[i-1];
			}
		}
		
		System.out.println(arr[n]);
	}

}
