package bj10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] queue = new int[10001];
    static int first = 0;

    static int last = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "front":
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push(int number) {
        queue[last] = number;
        last++;
    }

    public static int pop() {
        if (last - first == 0) {
            return -1;
        } else {
            int popNumber = queue[first];
            first++;
            return popNumber;
        }
    }

    public static int size() {
        return last - first;
    }

    public static int empty() {
        if (last - first == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int front() {
        if (last - first == 0) {
            return -1;
        } else {
            return queue[first];
        }
    }

    public static int back() {
        if (last - first == 0) {
            return -1;
        } else {
            return queue[last - 1];
        }
    }

}
