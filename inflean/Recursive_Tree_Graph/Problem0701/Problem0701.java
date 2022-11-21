package Recursive_Tree_Graph.Problem0701;

public class Problem0701 {

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
		Problem0701 t = new Problem0701();
		t.solution(3);
	}
}
