package algo_string;

import java.util.Scanner;

public class Main2_1 {
	public String solution(String str) {
		String answer="";
		for(char x : str.toCharArray()) {
			if(x>=97 && x<=122) // 소문자 찾기
				answer+=(char)(x-32); // 소문자를 대문자로 변환
			else answer+=(char)(x+32);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main2_1 T = new Main2_1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}

}
