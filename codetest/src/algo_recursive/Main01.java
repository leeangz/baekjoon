package algo_recursive;

//재귀함수
public class Main01 {
	public void DFS(int n) {
		// 무한 반복하기 때문에 return으로 종료시켜줌
		if(n==0) return;
		else {
			// System.out.print(n+" "); -> 3 2 1 출력
			// stack이 쌓이기 전 출력
			DFS(n-1); // DFS(2) 호출
			System.out.print(n+" ");
			// DFS로 쌓이고 나서 stack 출력이라 끝부터 출력
		}
	}
	
	public static void main(String[] args) {
		Main01 T = new Main01();
		T.DFS(3);
	}

}
