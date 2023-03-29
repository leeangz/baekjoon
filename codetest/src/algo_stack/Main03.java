package algo_stack;

import java.util.Scanner;
import java.util.Stack;
// 카카오 인형뽑기
public class Main03 {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for(int pos : moves) {
			for(int i=0;i<board.length;i++) { // 행 크기
				if(board[i][pos-1]!=0) { // 인형 발견
					int tmp=board[i][pos-1]; //tmp에 가져옴
					board[i][pos-1]=0; // 가져와진 인형 칸은 0으로 비움
					if(!stack.isEmpty()&&tmp==stack.peek()) { //스택에 있는 인형과 동일한지 확인
						answer+=2; // 일치하면 answer+=2
						stack.pop(); // 터트림
					}
					else stack.push(tmp); // 일치 안하면 그냥 쌓음
					break; // 한번 처리 후 멈춰야함
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main03 T = new Main03();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] board = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		int m = sc.nextInt();
		int[] moves = new int[m];
		for(int i=0;i<m;i++) moves[i]=sc.nextInt();
		System.out.println(T.solution(board, moves));
	}

}
