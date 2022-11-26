package recursive_tree_graph.Problem0702;

public class Main {

	public void DFS(int n) {
		if (n == 0) {
			return;
		} else {
			DFS(n / 2);
			System.out.print(n % 2);
		}
	}

	public void solution(int n) {
		DFS(n);
	}

	public static void main(String[] args) {
		Main t = new Main();
		t.solution(11);
	}
}

