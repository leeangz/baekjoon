package array;

import java.util.Scanner;

//소수(에라토스테네스 체)
// 이중포문 시간 초과
public class Main5 {
	public int solution(int n) {
		int answer=0;
		// 1은 제외 2부터 시작
		for(int i=2;i<n;i++) {
			int cnt=0;
			// 소수 갯수 찾기
			// j = 1 부터 나누면서, i를 j로 나누었을때 
			for(int j=1;j<=i;j++) {
				if (i%j==0) cnt++;
			}
			if (cnt==2) answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main5 T = new Main5();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));
	}

}
