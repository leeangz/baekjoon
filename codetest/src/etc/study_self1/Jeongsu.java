package etc.study_self1;

import java.util.Scanner;

public class Jeongsu {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		sc.close();
		
		int a1 = (A%10);
		int a2 = (A%100/10);
		int a3 = (A/100);
		
		int C = (a1*100)+(a2*10)+a3;
		
		int b1 = (B%10);
		int b2 = (B%100/10);
		int b3 = (B/100);
		
		int D = (b1*100)+(b2*10)+b3;
		
		if(C>D) System.out.println(C);
		else System.out.println(D);
	}

}
