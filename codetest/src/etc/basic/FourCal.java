package etc.basic;

import java.util.Scanner;

public class FourCal {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int A = sc.nextInt();
	int B = sc.nextInt();
	
	System.out.println(A + B);
	System.out.println(A - B);
	System.out.println(A * B);
	System.out.println(A / B);
	System.out.println(A % B);
	
	sc.close();
	}
}

