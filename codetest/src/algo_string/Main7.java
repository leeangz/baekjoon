package algo_string;

import java.util.Scanner;

//회문 문자열 = 앞에서 읽으나 뒤에서 읽으나 같은 문자열
public class Main7 {
	public String solution(String str) {
		str = str.toUpperCase();
		int len = str.length();
		// 길이를 반으로 나눔 -> 앞과 뒤에서 다가오고 char이 같은지 확인
		for(int i =0; i<len/2;i++) {
			if(str.charAt(i)!=str.charAt(len-i-1))
				return "NO";
		}
	
		return "YES";
	}
	
	public static void main(String[] args) {
		Main7 T = new Main7();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}

}
