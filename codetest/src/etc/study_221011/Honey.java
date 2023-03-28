package etc.study_221011;

/* 슈도코드
 *	1. 문제이해
 *		벌집 1단계 : 1		+5
 *		벌집 2단계 : 6		+7
 *		벌집 3단계 : 12		+9
 *		벌집 4단계 : 18		+11
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

public class Honey {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int room = sc.nextInt();
		
		int cnt = 1;
		int max = 2;
		
		sc.close();
		
		while(max <= room) { // 최대 방 갯수가 scanner로 받은 방 보다 마지막으로 작아야함
			max = max + (6*cnt); // 방갯수 = 방갯수 + 6의 배수로 늘어남
			cnt++; // cnt++니까 마지막으로 max가 작을때 +1로 나와서 성립
		
		} 
		System.out.println(cnt);
	}
}
