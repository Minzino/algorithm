package bj10866;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        while (testCase-- > 0) {
            String command = sc.next();
            if (command.equals("push_back")) {
                deque.offerLast(sc.nextInt());
            }
            if (command.equals("push_front")) {
                deque.offerFirst(sc.nextInt());
            }
            if (command.equals("front")) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.peekFirst()).append("\n");
                }
            }
            if (command.equals("back")) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.peekLast()).append("\n");
                }
            }
            if (command.equals("empty")) {
                if (deque.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }
            if (command.equals("size")) {
                sb.append(deque.size()).append("\n");
            }
            if (command.equals("pop_front")) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.pollFirst()).append("\n");
                }
            }
            if (command.equals("pop_back")) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.pollLast()).append("\n");
                }
            }
        }
        System.out.print(sb);
    }

}
