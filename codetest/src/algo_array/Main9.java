package algo_array;

import java.util.Scanner;
// 격자판 최대합
public class Main9 {
	public int solution(int n, int[][] arr) {
		int answer=Integer.MIN_VALUE;
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main9 T = new Main9();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}

}
