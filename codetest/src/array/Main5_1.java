package array;

import java.util.Scanner;

//소수(에라토스테네스 체)
public class Main5_1 {
	public int solution(int n) {
		int answer = 0;
		// 배열 n+1 해야 인덱스가 n까지 생김
		// 동적배열 0으로 초기화
		int[] ch = new int[n+1];
		// 배열 상대로 1~n까지 "배수" check
		for(int i=2;i<=n;i++) {
			if(ch[i]==0) {
				answer++;
				// 약수의 처음인 애들은 answer++
				for(int j=i;j<=n;j=j+i) ch[j]=1;
				// i의 배수들에 다 check
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Main5_1 T = new Main5_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));
	}

}
