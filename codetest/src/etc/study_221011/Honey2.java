package study_221011;

/* 슈도코드
 *	1. 문제이해
 *		벌집 1단계 : 1		+5
 *		벌집 2단계 : 6		+7
 *		벌집 3단계 : 13		+9
 *		벌집 4단계 : 22		+11
 *		벌집 n단계 : 1 + (2*2+1) + (2*3+1) + ... + (2n+1)
 *
 *		n단계의 벌집 max = max
 *
 *
 *	2. 문제풀이
 *		2-1. 스캐너로 숫자 받음 = room
 *		2-2. 
 *			for (int n=1;n>0;n++){
 *				if (max > room) {
 *					int max = 1;
 *					for(int n=1;n>0;n++) {
 *						max = max + 2*n + 1




*/

import java.util.Scanner;

public class Honey2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int room = sc.nextInt();
		
		sc.close();
		
		while(true) {
			int max = 1;
			int n = 1;
			if (max < room) { 
				max += max + 2*n + 1; 
				n++;
				} 
			else if (max >= room) System.out.println(n);
			}

	}
}
		
