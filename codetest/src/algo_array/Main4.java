package algo_array;

import java.util.Scanner;

//피보나치 수열
public class Main4 {
	public int[] solution(int n) {
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;

		if (n >= 2) {
			for (int i = 2; i < n; i++) {
				answer[i] = answer[i - 1] + answer[i - 2];
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Main4 T = new Main4();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int x : T.solution(n))
			System.out.print(x + " ");
	}

}
