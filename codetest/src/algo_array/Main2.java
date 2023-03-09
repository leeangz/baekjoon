package algo_array;

import java.util.Scanner;

//보이는 학생
public class Main2 {
	public int solution(int n, int[] arr) {
		int answer=1, max = arr[0];

		for(int i=1;i<n;i++) {
			if (arr[i]>arr[i-1]&&arr[i]>max) {
				answer++; 
				max=arr[i];
			}
			else answer=answer;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(T.solution(n, arr));
	}

}
