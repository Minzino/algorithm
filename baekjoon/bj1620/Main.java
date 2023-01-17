package bj1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            map1.put(name,i);
            map2.put(i, name);
        }

        for (int i = 0; i < m; i++) {
            String key = br.readLine();
            try{
                int intKey = Integer.parseInt(key);
                sb.append(map2.get(intKey)).append("\n");
            }catch(NumberFormatException e){
                sb.append(map1.get(key)).append("\n");
            }
        }
        System.out.print(sb);
    }

}
