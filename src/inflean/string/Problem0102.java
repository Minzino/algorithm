package inflean.string;

import java.util.Scanner;

public class Problem0102 {

	public String solution(String str) {
		StringBuilder sb = new StringBuilder();

		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c)) {
				sb.append(Character.toLowerCase(c));
			}
			if (Character.isLowerCase(c)) {
				sb.append(Character.toUpperCase(c));
			}
		}

		return String.valueOf(sb);
	}

	public static void main(String[] args) {
		Problem0102 T = new Problem0102();

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(T.solution(str));
	}
}
