package algo_string;

import java.util.Scanner;

public class Main2 {
	public String solution(String str) {
		String answer="";
		
		//문제 풀이 시작
		for(char x : str.toCharArray()) { // string 기반 문자열 생성
			if(Character.isLowerCase(x)) // x가 소문자인지 묻는 boolean
				answer+=Character.toUpperCase(x);
			else answer+=Character.toLowerCase(x);
		}
		
		/* String.toCharArray()
		 * 문자열을 한 글자씩 쪼개서 이를 char타입의 배열에 집어넣어주는 메소드
		 * String(문자열)을 char형 배열로 변경
		 * 
		 * String s1 = "Hello World";
		 * char[] charArr = s1.toCharArray();
		 * 
		 * String s2 = new String(charArr); -> char형 배열을 합쳐서 하나의 string으로 만들기
		 * 
		 * 
		 * ASCII 대문자 65~90, 소문자 97~122
		 * 소 - 대 = 32
		 * 
		 * */
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}

}
