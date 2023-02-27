package basic;

import java.io.FileInputStream;
import java.util.Scanner;

class Test {
	static int AnswerN; // 테스트 케이스 total
	static int N = 10;

	public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("C:\\sample_input.txt"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // 테스트케이스 갯수 선언
		int[] arr;

		// 테스트케이스 갯수 만큼 실행
		for (int test_case = 1; test_case <= T; test_case++) {

			N = sc.nextInt(); // each 테스트 케이스의 선수 수 선언

			for (int i = 0; i < N; i++) { // 테스트 케이스의 선수N만큼 선수 실력 배열 선언

				arr = new int[N];
				int NT = sc.nextInt(); // 선수 실력 배열 입력 받기
				arr[i] = NT; // 배열로 묶어두기
				int sen = 0 ;
				
				for (int j = 0; j < N; j++) { // 각 선수에 대해 팀원 점수 조합하기

					sen = arr[j]; // 해당 선수 지정
					int Answer = sen;

					for (int k = 1; k < N - j; k++) {
						
						if (Answer + arr[j + k] > Answer) Answer += arr[j+k];
						else Answer = Answer;			

					}
					for (j = N; j < N - j; j--) {
						Answer += arr[N - j];

						if (Answer + arr[N-j] > Answer) Answer += arr[N-j];
						else Answer = Answer;
					}

					if (Answer<0) Answer = -Answer; // 절댓값 표현
					else Answer = Answer;
					
					if (N>1) AnswerN += Answer; // 테스트케이스 점수 합계에 각 선수 조합 더하기
					else AnswerN = arr[0];
				}

			}
			
			System.out.println("#" + test_case + " " + AnswerN % 1000000007);

		}
	}
}