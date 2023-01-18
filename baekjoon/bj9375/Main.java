package bj9375;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            HashMap<String, Integer> kindMap = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String kind = st.nextToken();

                if (kindMap.containsKey(kind)) {
                    kindMap.put(kind, kindMap.get(kind) + 1);
                } else {
                    kindMap.put(kind, 1);
                }
            }
            int result = 1;
            for (int val : kindMap.values()) {
                result *= (val + 1);
            }
            sb.append(result - 1).append("\n");
        }
        System.out.print(sb);
    }

}
