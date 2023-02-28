package mol;

import java.util.Scanner;

//숫자만 추출
public class Main9 {
	public int solution(String s) {
		int answer = 0;
		for(char x : s.toCharArray()) {
			if(x>=48 && x<=57) answer=answer*10+(x-48);
			// 48~57 알파벳 ASCII 범위
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main9 T = new Main9();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}

}
