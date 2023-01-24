package bj1715;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Long> queue = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            queue.add(Long.valueOf(br.readLine()));
        }

        long num = 0;

        while (queue.size() > 1) {
            long tmp1 = queue.poll();
            long tmp2 = queue.poll();

            num += tmp1 + tmp2;
            queue.add(tmp1 + tmp2);
        }

        System.out.println(num);

    }

}
