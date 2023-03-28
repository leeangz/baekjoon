package algo_stack;

import java.util.Scanner;
import java.util.Stack;
//올바른 괄호 = STACK
// 갯수를 찾는게 아니라, 안에 push가 되어있으면 pop 함
public class Main01 {
	public String solution(String str) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		for(char x : str.toCharArray()) {
			if(x=='(') stack.push(x);
			else {
				//stack이 비어있는지 물어봄
				if(stack.isEmpty()) return "NO";
				//비어있는거 아니면 꺼냄
				stack.pop();
			}
		}
		if(!stack.isEmpty()) return "NO";

		return answer;
	}
	
	public static void main(String[] args) {
		Main01 T = new Main01();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}

}
