package bj2164;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
        int cards = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= cards; i++) {
            queue.offer(i);
        }
        for (int i = 1; i < cards; i++) {
            queue.poll();
            queue.offer(queue.poll());
        }
        System.out.print(queue.peek());

    }

}
