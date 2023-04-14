package algo_DFS;

import java.util.Scanner;

// 바둑이 승차 - DFS
public class MainBaduk {
	static int answer = Integer.MIN_VALUE, c, n;
	public void DFS(int L, int sum, int[] arr) {
		if(sum>c) return;
		if(L==n) {
			answer = Math.max(answer, sum);
		} else {
			DFS(L+1, sum+arr[L], arr);
			DFS(L+1, sum, arr);
		}
		
	}
	
	public static void main(String[] args) {
		MainBaduk T = new MainBaduk();
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt(); // 총 무게
		n = sc.nextInt(); // 바둑이 마릿수
		int[] arr = new int[n]; // 배열 만듬
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		T.DFS(0,0,arr); // 재귀 넘어감
		System.out.println(answer);
	}

}
