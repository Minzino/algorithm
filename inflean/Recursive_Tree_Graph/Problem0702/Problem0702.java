package Recursive_Tree_Graph.Problem0702;

public class Problem0702 {

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
		Problem0702 t = new Problem0702();
		t.solution(11);
	}
}

