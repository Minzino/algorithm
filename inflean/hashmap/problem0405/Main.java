package hashmap.problem0405;

import java.util.*;

class Main {

	public int solution(int[] arr, int n, int k) {
		int answer = -1;
		TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int l = j + 1; l < n; l++) {
					treeSet.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}
		int cnt = 0;

		for (int x : treeSet) {
			cnt++;
			if (cnt == k) {
				return x;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(arr, n, k));
	}
}
