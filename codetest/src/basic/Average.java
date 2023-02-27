package basic;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();  // 시험을 본 과목의 개수 입력
			int Score[] = new int[N];  // 각 과목의 시험 성적 입력 -> N의 갯수 만큼 입력 가능
														 // 리스트의 크기
			for (int i=0 ; i<N ; i++) {
				Score[i] = sc.nextInt();    // i로 리스트 크기 제한, N만큼의 숫자 입력
			}
			
			double sum = 0; // 출력 결과에 소수값이 있어서 double 사용
			int max = 0;
			
			for (int i=0; i<N ; i++) {
				if(Score[i] > max) max = Score[i]; // max값으로 큰 수 나오면 초기화
				sum = sum + Score[i]; // 총점을 위해 sum에 값 계속 저장
			}
			sc.close();
			
			System.out.println(sum * 100.0 / max / N);
			/* 변환 점수의 평균을 구하는 식 ( A, B, C)
			   {(A/M*100)+(B/M*100)+(C/M*100)}/3 = (A+B+C)*100/M/3
	             -> sum * 100.0 / max / N   					*/
		}
	}


