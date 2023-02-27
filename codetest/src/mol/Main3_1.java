package mol;

import java.util.Scanner;
// indexOf
public class Main3_1 {
	public String solution(String str) {
		String answer="";
		int m = Integer.MIN_VALUE, pos;
		while((pos=str.indexOf(' '))!=-1) {
			String tmp = str.substring(0, pos); // pos 전까지
			int len = tmp.length();
			if(len>m) {
				m = len;
				answer = tmp;
			}
			str = str.substring(pos+1);
		}
		if(str.length()>m) answer = str;
		return answer;
		
		/* str.substring() -> 문자열 자르기
		 * str.indexOf() -> str 앞에서부터 index 지정한 val가 처음으로 발견되는 위치의 index 반환
		 * */
	}
	
	public static void main(String[] args) {
		Main3_1 T = new Main3_1();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));
	}

}
