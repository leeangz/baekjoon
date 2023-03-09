package algo_string;

import java.util.Scanner;

//회문 문자열 = 앞에서 읽으나 뒤에서 읽으나 같은 문자열
public class Main7_1 {
	public String solution(String str) {
		str = str.toUpperCase();
		String tmp = new StringBuilder(str).reverse().toString();
		// 문자열 비교 = equals() : 대소문자 비교, equalsIgnoreCase() : 대소문자 비교 안함
		if(str.equalsIgnoreCase(tmp)) return "YES";
	
		return "NO";
	}
	
	public static void main(String[] args) {
		Main7_1 T = new Main7_1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}

}
