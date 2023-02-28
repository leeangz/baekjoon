package mol;

import java.util.Scanner;
//특정 문자 뒤집기
public class Main5 {
	public String solution(String str) {
		String answer;
		char[]  s = str.toCharArray(); //str기반 문자배열 생성
		int lt =0, rt = str.length()-1;
		while(lt<rt) { // 왼쪽에서 출발과 오른쪽에서 출발하는 index값이 가운데에서 만나면 멈춤
			if(!Character.isAlphabetic(s[lt])) lt++; // 알파벳이 아니면 옮김
			else if(!Character.isAlphabetic(s[rt])) rt--; // 알파벳이 아니면 옮김
			else { // 알파벳이면 
				char tmp=s[lt]; // 왼쪽값에 tmp 고정
				s[lt]=s[rt]; // 오른쪽 값에 왼쪽값 고정
				s[rt]=tmp; // 오른쪽값에 tmp 값 고정
				lt++; // 한칸 옮김
				rt--; // 한칸 옮김
			}
		} // answer에 str 전환 필요
		answer = String.valueOf(s);
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main5 T = new Main5();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}

}
