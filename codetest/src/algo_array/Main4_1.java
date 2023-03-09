package algo_array;

import java.util.Scanner;

//피보나치 수열
public class Main4_1 {
	public void solution(int n) {
		int a=1, b=1, c;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<n;i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

	public static void main(String[] args) {
		Main4_1 T = new Main4_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		T.solution(n);
	}

}
