package stack_queue.Problem0503;

import java.util.Scanner;
import java.util.Stack;

public class Problem0503 {

	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		stack.push(0);

		for (int move : moves) {
			for (int j = 0; j < board.length; j++) {
				if (board[j][move - 1] != 0) {
					if (stack.peek() == board[j][move - 1]) {
						stack.pop();
						answer += 2;
					} else {
						stack.push(board[j][move - 1]);
					}
					board[j][move - 1] = 0;
					break;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Problem0503 t = new Problem0503();

		int number = sc.nextInt();
		int[][] board = new int[number][number];

		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				board[i][j] = sc.nextInt();
			}
		}

		int move = sc.nextInt();
		int[] moves = new int[move];

		for (int i = 0; i < move; i++) {
			moves[i] = sc.nextInt();
		}

		System.out.println(t.solution(board, moves));

	}

}
