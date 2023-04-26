package bj16496;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        String[] numbers = new String[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = st.nextToken();
        }

        Arrays.sort(numbers, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if (numbers[0].equals("0")) {
            System.out.println("0");
        } else {
            for (String number : numbers) {
                sb.append(number);
            }
            System.out.println(sb);
        }
    }
}


