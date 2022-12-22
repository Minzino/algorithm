package bj10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Stack<String> stack = new Stack<>();

        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command) {
                case "push": {
                    stack.push(st.nextToken());
                    continue;
                }
                case "pop": {
                    if(stack.empty()){
                        sb.append(-1).append("\n");
                        continue;

                    }else{
                        sb.append(stack.peek()).append("\n");
                        stack.pop();
                        continue;

                    }
                }
                case "size": {
                    sb.append(stack.size()).append("\n");
                    continue;

                }
                case "empty": {
                    if(stack.empty()){
                        sb.append(1).append("\n");
                        continue;

                    }else{
                        sb.append(0).append("\n");
                        continue;

                    }
                }
                case "top": {
                    if(stack.empty()){
                        sb.append(-1).append("\n");

                    }else {
                        sb.append(stack.peek()).append("\n");
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
