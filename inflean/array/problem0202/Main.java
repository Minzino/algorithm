package array.problem0202;

import java.util.Scanner;

public class Main {

	public int solution(int numberOfStudents, int[] heightOfStudents) {
		int answer = 1;
		int max = heightOfStudents[0];
		for (int i = 1; i < numberOfStudents; i++) {
			if (heightOfStudents[i] > max) {
				max = heightOfStudents[i];
				answer ++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main T = new Main();

		int numberOfStudents = sc.nextInt();
		int[] heightOfStudents = new int[numberOfStudents];
		for (int i = 0; i < numberOfStudents; i++) {
			heightOfStudents[i] = sc.nextInt();
		}

		System.out.println(T.solution(numberOfStudents, heightOfStudents));
	}

}
