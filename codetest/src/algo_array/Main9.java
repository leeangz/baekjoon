package algo_array;

import java.util.Scanner;
// 격자판 최대합
public class Main9 {
	public int solution(int n, int[][] arr) {
		int answer=Integer.MIN_VALUE; // -2147483648 출력
		int sum1, sum2; // sum1 행의 합, sum2 열의 합
		
		for(int i=0;i<n;i++) {
			sum1=sum2=0;
			for(int j=0;j<n;j++) {
				sum1+=arr[i][j];
				sum2+=arr[j][i];
			}
			answer=Math.max(answer, sum1);
			answer=Math.max(answer, sum2);
		}
		sum1=sum2=0;
		for(int i=0;i<n;i++) {
			sum1+=arr[i][i];
			sum2+=arr[i][n-i-1];
		}
		answer=Math.max(answer, sum1);
		answer=Math.max(answer, sum2); //최대값 구하기 -> answer, sum2 비교해서 더 큰 숫자가 남음
		
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
