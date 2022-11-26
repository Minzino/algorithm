package recursive_tree_graph.Problem0701;

public class Main {

	public void DFS(int n) {
		if (n == 0) {
			return;
		} else {
			DFS(n - 1);
			System.out.print(n + " ");
		}
	}

	public void solution(int n) {
		DFS(n);
	}

	public static void main(String[] args) {
		Main t = new Main();
		t.solution(3);
	}
}
