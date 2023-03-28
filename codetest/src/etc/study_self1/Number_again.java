package etc.study_self1;
import java.util.Scanner;

public class Number_again {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=0; i<N;i++) {
			int a = sc.nextInt();
			String b = sc.next();
			
			for(int j=0;j<b.length();j++) {
				for(int k=0;k<a;k++) {
					System.out.print(b.charAt(j));
				}
			}
			
		} System.out.println();
		
		sc.close();
		
	} 

}
