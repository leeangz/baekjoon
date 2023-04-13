package baekjoon;

import java.util.Scanner;

// 재귀 팩토리얼 풀기
public class B27433 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		System.out.println(fact(input));
	}
	
	public static long fact(int n) {
		
		if(n<=1) {
			return 1;
		} else 
			return fact(n-1)*n;
	}

}
