package study_0113;

import java.util.Scanner;

public class N1193 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt= 0;
		
		for(int i=1;i<n;i++) {
			for(int j=1;j<i;j++) {
				cnt++;
			}
			System.out.println(cnt);
		}
		//	1 1 2 1 2 3 1 2 3 4 a
		//	1 2 1 3 2 1 4 3 2 1 b
	}

}
