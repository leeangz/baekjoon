package etc.study_221011;

// 슈도코드

/* 1. 문제이해
		1-1.  A 고정비용
		1-2.  B 가변비용
		1-3.  C 노트북비용
		
		
		

*/

import java.util.Scanner;

public class BreakEvenPoint {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		if (C <= B) System.out.println("-1");
		else System.out.println(A/(C-B)+1);
		
			sc.close();
		} 
		
		
	}
