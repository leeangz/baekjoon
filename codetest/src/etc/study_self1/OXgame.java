package study_self1;

import java.util.Scanner;

public class OXgame {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
	for(int i=1;i<=tc;i++) {
			String arr = sc.nextLine();
			int cnt = 0;
			for(int j=0;j<arr.length(); j++) {
				if(arr.charAt(j) == 'O') {
					cnt += 3;
				}
				if (arr.charAt(j) == 'X') {
					cnt += 1;
				}
			} System.out.println(cnt);
			
		} sc.close();
	}

}
