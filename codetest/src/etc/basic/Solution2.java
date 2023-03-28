package etc.basic;

import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 

		int tc = sc.nextInt(); // 테스트케이스 개수
		
		for(int i = 1; i <= tc; i++) { // tc 만큼 갯수 뽑아내기
			
			int N = sc.nextInt(); // 바둑판 크기 N 입력
			
			boolean check[] = new boolean[101]; // 바둑판 크기 8<=N<=100 확인
			
			for(int j=8 ; j<101 ; j++) {
				if ( N < 101 ) {
					check[N] = true;
				}
			} sc.close();
			
			String [][] arr = new String[N][N]; // N*N 크기 배열 입력
			for(int h=0 ; h < N ; h++) {
				arr[h][h] = sc.next();
				}

			
			int cnt = 0;
			int sum = 0;
			
			
			if (sum == 5) cnt++; // 합계 5인 수가 알을 먹는 수
			else continue;
			
				
			System.out.println("#" + tc + " " + cnt); // 결과값 출력
		}
	}
}
	