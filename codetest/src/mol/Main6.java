package mol;

import java.util.Scanner;

//중복문자제거
public class Main6 {
	public String solution(String str) {
		String answer="";
		//indexOf 사용
		for(int i=0;i<str.length();i++) {
			//중복문자 판별, 자신의 위치와 index위치가 일치하는지 확인
			//System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
			//내 위치가 인덱스의 위치가 동일하면, answer에 char 추가
			if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
		
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main6 T = new Main6();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		
	}

}
