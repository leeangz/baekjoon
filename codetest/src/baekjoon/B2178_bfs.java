package baekjoon;

import java.util.*;

public class B2178_bfs {
	static int N, M;
	static int[][] map;
	static boolean[][] visited; // 방문 체크 배열

	static int cnt = 1; // 출발 지점 (1, 1)은 항상 1로 주어짐

	static int[] dy = { 1, 0, -1, 0 };
	static int[] dx = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		map = new int[N][M]; // 맵 선언

		visited = new boolean[N][M]; // 방문자 배열 선언

		String str;

		for (int i = 0; i < N; i++) {
			str = sc.next();
			for (int j = 0; j < M; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}

		bfs();

		System.out.println(map[N - 1][M - 1]); // 끝 지점의 값 출력
	}

	public static void bfs() {
		var queue = new LinkedList<int[]>();

		queue.add(new int[] { 0, 0 }); // 첫 탐색 지역 (0, 0)

		int[] tmp = new int[2]; // 행&열 값으로 들어갈 크기 2의 int[] 배열 선언

		visited[0][0] = true; // 첫 방문 지역은 탐색한 상태에서 시작

		int y, x; // Queue 값을 담을 y, x

		int ny, nx;

		while (!queue.isEmpty()) {
			tmp = queue.poll();
			y = tmp[0];
			x = tmp[1];

			for (int i = 0; i < 4; i++) { // 사방 탐색 (상하좌우)
				ny = y + dy[i];
				nx = x + dx[i];
				if (ny < 0 || nx < 0 || ny >= N || nx >= M)
					continue;
				if (!visited[ny][nx] && map[ny][nx] == 1) {
					visited[ny][nx] = true;
					map[ny][nx] += map[y][x];
					queue.add(new int[] { ny, nx });
				}

			}
		}
	}
}
