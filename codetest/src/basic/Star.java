package basic;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		sc.close();
		
		int a = 0;
		for(a=1 ; a<=i; a++) {
			for(int j=0; j < a ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
