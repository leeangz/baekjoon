package etc.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Average2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();  // 시험을 본 과목의 개수 입력
		int Score[] = new int[N]; 
		for(int i=0 ; i<Score.length ; i++) {
			Score[i] = sc.nextInt();	// 각 과목의 시험 성적 입력 -> N의 갯수 만큼 입력 가능
		sc.close();
		}
		
		double sum = 0;
		Arrays.sort(Score);	//sort() 사용해서 점수 정렬
		for(int i=0 ; i<Score.length ; i++) {	// Score 돌리면서 sum 집계
			sum += Score[i];
		}
		System.out.println(sum * 100  / Score[Score.length-1] / Score.length); // Max 값을 정렬한 Score 배열에서 마지막 숫자로 지정
	}

}
/*
boolean[] check = new boolean[10001];

for(int i=1;i<10001;i++) {
	int n = d(i);
	
	if(n<10001) {
		check[n] = true;
	}
}

String s = sc.nextLine();

int k = s.length();

for(int i = o;i<k;i++);

switch(s.charAt(i)) {

char[][] arr = new arr[N][N];

*/