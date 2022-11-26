package string.problem0105;

import java.util.Scanner;

public class Main {

	public String solution(String str) {
		String answer;
		char[] s = str.toCharArray();
		int left = 0;
		int right = str.length() - 1;
		while (left < right) {
			if (!Character.isAlphabetic(s[left])) {
				left++;
			} else if (!Character.isAlphabetic(s[right])) {
				right--;
			}
			else{
				char tmp = s[left];
				s[left] = s[right];
				s[left] = tmp;
				left++;
				right--;
			}
		}
		answer = String.valueOf(s);
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}
