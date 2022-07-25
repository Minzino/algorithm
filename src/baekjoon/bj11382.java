package baekjoon;

import java.util.Scanner;

/*
https://www.acmicpc.net/problem/11382
 */

public class bj11382 {

	public long solution(String numbers) {
		long answer = 0;
		String[] longArr = numbers.split(" ");
		for (String number : longArr) {
			answer += Long.parseLong(number);
		}
		return answer;
	}

	public static void main(String[] args) {
		bj11382 T = new bj11382();
		Scanner sc = new Scanner(System.in);
		String numbers = sc.nextLine();
		System.out.println(T.solution(numbers));
	}

}
