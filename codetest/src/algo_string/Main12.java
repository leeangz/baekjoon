package algo_string;

import java.util.Scanner;
//암호
class Main12 {
	public String solution(int n, String s) {
		String answer="";
		for(int i=0;i<n;i++) {
			//0~7로 자르고
			String tmp = s.substring(0,7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp,2); //2진수를 10진수로 바꾸기!
			answer+=(char)num;
			s=s.substring(7); //7글자 단위로 삭제
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main12 T = new Main12();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(T.solution(n, str));
	}

}
