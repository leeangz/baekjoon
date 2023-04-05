package algo_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 교육 과정 설계
// CBA 순서
public class Main07 {
	public String solution(String need, String plan) {
		String answer = "YES";
		Queue<Character> Q = new LinkedList<>();
		
		// 한글자씩 분석해서 순서대로 .poll();
		for(char x : need.toCharArray()) Q.offer(x);
		for(char x : plan.toCharArray()) {
			if(Q.contains(x)) {
				if(x!=Q.poll()) return "NO";
			}
		}
		if(!Q.isEmpty()) return "NO";
		return answer;
	}
	
	public static void main(String[] args) {
		Main07 T = new Main07();
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(T.solution(a,b));
		
	}

}
