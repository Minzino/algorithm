package inflean.Recursive_Tree_Graph;

import java.util.*;

class Node2 {

	int data;
	Node2 lt, rt;

	public Node2(int val) {
		data = val;
		lt = rt = null;
	}
}

public class Problem0710 {

	Node2 root;

	public int BFS(Node2 root) {
		Queue<Node2> Q = new LinkedList<>();
		Q.offer(root);
		int L = 0;
		while (!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				Node2 cur = Q.poll();
				if (cur.lt == null && cur.rt == null) {
					return L;
				}
				if (cur.lt != null) {
					Q.offer(cur.lt);
				}
				if (cur.rt != null) {
					Q.offer(cur.rt);
				}
			}
			L++;
		}
		return 0;
	}

	public static void main(String args[]) {
		Problem0710 tree = new Problem0710();
		tree.root = new Node2(1);
		tree.root.lt = new Node2(2);
		tree.root.rt = new Node2(3);
		tree.root.lt.lt = new Node2(4);
		tree.root.lt.rt = new Node2(5);
		System.out.println(tree.BFS(tree.root));
	}
}
