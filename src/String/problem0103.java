package String;

import java.util.Scanner;

public class problem0103 {

	public String solution(String str) {
		String answer = "";
		String[] s = str.split(" ");
		int min = Integer.MIN_VALUE;
		for (String x : s) {
			int length = x.length();
			if (length > min) {
				min = length;
				answer = x;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		problem0103 T = new problem0103();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));
	}

}
