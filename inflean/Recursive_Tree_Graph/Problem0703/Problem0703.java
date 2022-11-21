package Recursive_Tree_Graph.Problem0703;

class Problem0703 {

	public int DFS(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * DFS(n - 1);
		}
	}

	public static void main(String[] args) {
		Problem0703 t = new Problem0703();
		System.out.println(t.DFS(5));
	}
}
