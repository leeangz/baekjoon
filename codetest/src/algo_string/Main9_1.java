package algo_string;

import java.util.Scanner;

public class Main9_1 {
	public int solution(String s) {
		String answer = "";
		for (char x : s.toCharArray()) {
			if (Character.isDigit(x)) // 숫자인게 참이면
				answer += x;
		}
		return Integer.parseInt(answer);
	}

	public static void main(String[] args) {
		Main9_1 T = new Main9_1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}

}
