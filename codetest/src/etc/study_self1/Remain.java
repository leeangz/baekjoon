package study_self1;

import java.util.Scanner;

public class Remain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr; // 입력한 값 배열 만들기
		
		int cnt = 0;
		
		for(int i=0; i<10;i++) { //배열의 숫자 10개
			int N  = sc.nextInt(); // 10개 입력받기
			arr = new int[N]; // 배열에 10개 저장
			
			for(int j=0;j<arr.length;j++) { // 배열을 순서대로 42로 나누기 위한 배열 순서 for문
					int k=0;
					if(arr[j]%42 == k) { // j번째 수를 42로 나눈 값을 k로 저장
						arr[j] = k; // 나머지로 값 변경
					} 
			} 
			/*
			 * if((arr.charAt(i) - '0') == i) { cnt++;
			 */
			} System.out.println(cnt);
		}
}
