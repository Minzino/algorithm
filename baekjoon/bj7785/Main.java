package bj7785;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Map<String, String> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String log = st.nextToken();
            if (log.equals("leave")) {
                map.remove(name);
            }else{
                map.put(name, log);
            }
        }
        ArrayList<String> list = new ArrayList<>(map.keySet());

        list.sort(Collections.reverseOrder());

        for(String str: list){
            System.out.println(str);
        }

    }

}
