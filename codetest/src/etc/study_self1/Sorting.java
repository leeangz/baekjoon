package etc.study_self1;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		int[] arr = new int[tc];
		
		
		for(int i=0; i<tc; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(arr);
		
		for(int val : arr) {
			System.out.println(val);
		}
	}

}
