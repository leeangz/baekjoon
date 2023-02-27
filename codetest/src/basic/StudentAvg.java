package basic;

import java.util.Scanner;

public class StudentAvg {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int[] arr;
		
		int TestCase = sc.nextInt();
		
		for(int i=0;i<TestCase;i++) {
			int N  = sc.nextInt();
			arr = new int[N];
		
			
		double sum = 0;
		
		for (int j=0;j < N ; j++) {
			int val = sc.nextInt();
			arr[j] = val;
			sum += val;
		} sc.close();
		
		double avg = sum/N;
		double cnt = 0;
		
		for(int j=0;j<N;j++) {
			if(arr[j] > avg) {
				cnt++;
			}
		}
		System.out.printf("%.3f%%\n", (cnt/N)*100);
		
		}
	}
}
