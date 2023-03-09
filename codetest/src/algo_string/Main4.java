package algo_string;

import java.util.ArrayList;
import java.util.Scanner;

//stringbuiler.reverse
public class Main4 {
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main4 T = new Main4();
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
