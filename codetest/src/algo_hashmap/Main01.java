package algo_hashmap;

import java.util.HashMap;
import java.util.Scanner;

//학급 회장
public class Main01 {
	public char solution(int n, String s) {
		char answer=' ';
		// Key - Value
		HashMap<Character,Integer> map = new HashMap<>();
		// map.put('A', 3); key-value : A-3
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
			// **getOrDefault = 있으면 가져오고 없으면 가져오지 마라
			// map의 값이 x값인 애를 가져와라
			// 없으면 -> 0 return
		}
		//특정 키가 있는지 확인하는 방법
		//System.out.println(map.containsKey('F'));
		
		//키의 갯수 = .length() 같은 거
		//System.out.println(map.size());
		
		//키 제거
		//System.out.println(map.remove('A'));
		
		int max =Integer.MIN_VALUE;
		for(char key : map.keySet()) {
			//System.out.println(key+" "+map.get(key));
			if(map.get(key)>max) {
				max = map.get(key);
				answer=key;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main01 T = new Main01();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(T.solution(n, str));
	}

}
