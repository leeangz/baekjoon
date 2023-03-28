package etc.study_self1;

import java.util.Scanner;

public class FindBunsu {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		// 1 1 2 1 2 3 1 2 3 4
		// 1 2 1 3 2 1 4 3 2 1
		
		int p=0;
		
		for (int i=0; i<A ; i++) {
			for(int j=0;j<i;j++) {	
				p++;
			}
		}
		
		System.out.println(p+"/");
	}

}
