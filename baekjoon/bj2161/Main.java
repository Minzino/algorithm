package bj2161;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Queue<Integer> queue = new LinkedList<>();

        int cards = Integer.parseInt(br.readLine());

        for (int i = 1; i <= cards; i++) {
            queue.offer(i);
        }
        for (int i = 1; i <= cards; i++) {
            sb.append(queue.poll()).append(" ");
            queue.offer(queue.poll());
        }

        System.out.print(sb);
    }
}
