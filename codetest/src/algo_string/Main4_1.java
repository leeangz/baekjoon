package algo_string;

import java.util.ArrayList;
import java.util.Scanner;
// left right
public class Main4_1 {
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			char[] s = x.toCharArray();
			//String을 char형 배열로 변경
			//char 형 배열을 합쳐서 하나의 String 으로 변환
			int lt=0, rt=x.length()-1;
			while(lt<rt) {
				char tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main4_1 T = new Main4_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		for(int i=0; i<n; i++) {
			str[i]= sc.next();
		}
		for(String x : T.solution(n, str)) {
			System.out.println(x);
		}
	}

}
