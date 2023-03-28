package algo_hashmap;

import java.util.HashMap;
import java.util.Scanner;
//아나그램
public class Main02 {
	public String solution(String s1, String s2) {
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x : s1.toCharArray()) {
			map.put(x, map.getOrDefault(x,0)+1);
		}
		for(char x : s2.toCharArray()) {
			// x가 존재하지 않을 떄, x의 개수가 0일때
			if(!map.containsKey(x) || map.get(x)==0) return "NO";
			map.put(x, map.get(x)-1);
		}		
		return "YES";
	}
	
	public static void main(String[] args) {
		Main02 T = new Main02();
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(T.solution(a, b));
	}

}
