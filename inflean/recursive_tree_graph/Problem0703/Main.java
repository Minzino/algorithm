package recursive_tree_graph.Problem0703;

class Main {

	public int DFS(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * DFS(n - 1);
		}
	}

	public static void main(String[] args) {
		Main t = new Main();
		System.out.println(t.DFS(5));
	}
}
