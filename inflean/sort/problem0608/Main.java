package sort.problem0608;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int lt = 0, rt = n - 1;
		while (lt <= rt) {
			int mid = (lt + rt) / 2;
			if (arr[mid] == m) {
				answer = mid + 1;
				break;
			}
			if (arr[mid] > m) {
				rt = mid - 1;
			} else {
				lt = mid + 1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main t = new Main();

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(t.solution(n, m, arr));

	}

}
