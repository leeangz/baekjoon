package algo_DFS;

import java.util.Scanner;

// 최대 점수 구하기
public class MainMax {
	static int answer = Integer.MIN_VALUE, n, m;
	public void DFS(int L, int sum, int time, int[] ps, int[] pt) {
		if(time>m) return;
		if(L==n) {
			answer=Math.max(answer, sum);
		} else {
			DFS(L+1, sum+ps[L], time+pt[L], ps, pt);
			DFS(L+1, sum, time, ps, pt);
		}
		
	}
	
	public static void main(String[] args) {
		MainMax T = new MainMax();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // 갯수
		m = sc.nextInt(); // 제한 시간
		int[] a = new int[n]; // 점수
		int[] b = new int[n]; // 걸리는 시간
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt(); // 점수
			b[i]=sc.nextInt(); // 걸리는 시간
		}
		T.DFS(0,0,0,a,b); // 재귀로 넘김
		System.out.println(answer);
	}

}
