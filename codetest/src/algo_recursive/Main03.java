package algo_recursive;

// 팩토리얼 - 재귀
public class Main03 {
	public int DFS(int n) {
		if(n==1) return 1;
		else return n*DFS(n-1);
		
	}
	public static void main(String[] args) {
		Main03 T = new Main03();
		System.out.println(T.DFS(5));
	}

}
