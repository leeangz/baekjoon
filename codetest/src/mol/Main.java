package mol;

import java.util.Scanner;

public class Main {
	public int solution(String str, char t) {
		// 프로그래머스 방식
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		//System.out.println(str + " " + t);
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==t) answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// 백준 방식
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0); // 0번의 문자 한개를 가져와라
		
		System.out.println(T.solution(str, c));
	}

}
