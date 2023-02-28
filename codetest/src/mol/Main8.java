package mol;

import java.util.Scanner;

//팰린드롭 = 앞으로 읽으나 뒤로 읽으나 같은 문자열
// but 알파벳만 대상 -> 특수문자 제외
public class Main8 {
	public String solution(String s) {
		String answer="NO";
		s = s.toUpperCase().replaceAll("[^A-Z]", "");
		//"[^A-Z]" = A ~ Z까지가 아니면
		String tmp = new StringBuilder(s).reverse().toString();
		//toString을 붙여야 String으로 변환됨
		if(s.equals(tmp)) answer = "YES";
		return answer;
	}
	
	public static void main(String[] args) {
		Main8 T = new Main8();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));
	}

}
