package etc.study_221011;

import java.util.Scanner;

public class BreakEvenPoint2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int i = 0 ;
		while(true) {
			int sum = A + i*B;
			if (sum < C*i)
			i++;
			System.out.println(i);
			break;
		}
		sc.close();
			
		} 
		
		
	}
