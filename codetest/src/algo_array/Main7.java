package algo_array;

import java.util.Scanner;

public class Main7 {
	public int solution(int n, int[] arr) {
		int answer;	
		if(arr[0]==1) answer=1;
		else answer=0;
		
		int cnt = 1;
		
		for(int i=1;i<n;i++) {
			if(arr[i]==0) {
				answer=answer;
				cnt=1;
			}
			else if (arr[i]==1) {
				if(arr[i-1]==1) {
					cnt++;
					answer = answer+cnt;
					}
				else if (arr[i-1]==0)
					answer++;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Main7 T = new Main7();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}

		System.out.println(T.solution(n, arr));
	}

}
