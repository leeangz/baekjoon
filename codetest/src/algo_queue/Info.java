package algo_queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Info {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>(); // int형 선언
		Queue<String> qs = new LinkedList<>(); // string형 선언
		
		//int형에 추가
		Queue<Integer> stack = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.offer(3);
		
		// 반 삭제
		Queue<Integer> queue1 = new LinkedList<>(); //int형 queue 선언
		queue.offer(1);     // queue에 값 1 추가
		queue.offer(2);     // queue에 값 2 추가
		queue.offer(3);     // queue에 값 3 추가
		queue.poll();       // queue에 첫번째 값을 반환하고 제거 비어있다면 null
		queue.remove();     // queue에 첫번째 값 제거
		queue.clear();      // queue 초기화
		
		Queue<Integer> queue2 = new LinkedList<>(); //int형 queue 선언
		queue.offer(1);     // queue에 값 1 추가
		queue.offer(2);     // queue에 값 2 추가
		queue.offer(3);     // queue에 값 3 추가
		queue.peek();       // queue의 첫번째 값 참조
		
		queue.poll(); // 맨 앞의 값 삭제
		queue.remove(); // 맨 앞의 값 삭제
		queue.clear(); // Index의 값 삭제
		
		queue.size(); // 큐의 크기
		
		/* Iterator 클래스를 사용하여 값 출력 */
		Iterator iter = queue.iterator();
		while(iter.hasNext())
			System.out.print(iter.next() + " ");


	}

}
