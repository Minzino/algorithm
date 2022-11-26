package bj7795;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ7795 {

	public int solution(int a, int b, int[] arr1, int[] arr2) {
		int answer = 0;
		Arrays.sort(arr2);
		for (int i = 0; i < a; i++) {
			for (int j = b - 1; j >= 0; j--) {
				if (arr1[i] > arr2[j]) {
					answer += j + 1;
					break;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		BJ7795 t = new BJ7795();
		StringBuilder sb = new StringBuilder();

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 0; i < testCase; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int[] arr1 = new int[a];
			int[] arr2 = new int[b];

			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < a; j++) {
				arr1[j] = Integer.parseInt(st.nextToken());
			}

			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < b; j++) {
				arr2[j] = Integer.parseInt(st.nextToken());
			}
			sb.append(t.solution(a, b, arr1, arr2)).append("\n");
		}
		System.out.println(sb);
	}
}
