package algo_BFS;

//이진트리 레벨탐색 : BFS=Breadth-First Search
class Node{
	int data;
	Node lt, rt;
	public Node(int val) {
		data = val;
		lt=rt=null;
	}
}

public class Main01 {
	Node root;
	public void BFS(Node root) {
		
	}
	
	public static void main(String args[]) {
		Main01 tree = new Main01();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.BFS(tree.root); //100번지
	}

}
