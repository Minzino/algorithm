package inflean.sort;

import java.util.*;

class Problem0605 {

	public String solution(int n, int[] arr) {
		String answer = "U";
		Arrays.sort(arr);
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				answer = "D";
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Problem0605 t = new Problem0605();
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] arr = new int[number];
		for (int i = 0; i < number; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(t.solution(number, arr));
	}
}
