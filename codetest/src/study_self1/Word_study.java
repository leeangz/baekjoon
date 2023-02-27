package study_self1;

import java.util.Scanner;

public class Word_study {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int abc[] = new int[26];
		
		String Word = sc.next().toUpperCase();
		sc.close();
		
		int max = 0;
		char st = '?';
		
		for(int i=0;i<Word.length(); i++) {
			abc[Word.charAt(i)-65]++;
			if(max<abc[Word.charAt(i)-65]) {
				max = abc[Word.charAt(i)-65];
				st = Word.charAt(i);
			}
			else if(max==abc[Word.charAt(i)-65]) st = '?';
				
		}
		System.out.println(st);
	}
}


