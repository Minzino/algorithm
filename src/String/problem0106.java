package String;

import java.util.Scanner;

public class problem0106 {

	public String solution(String str) {
		String answer = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == i) {
				answer += str.charAt(i);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		problem0106 T = new problem0106();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}
