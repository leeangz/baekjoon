package array;

import java.util.Scanner;

public class Main3 {
	public String solution(int n, int[] a, int[] b) {
		String answer="";
		
		return answer;
	}
	public static void main(String[] args) {
		Main3 T = new Main3();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}
		System.out.println(T.solution(n, a, b));
	}

}
