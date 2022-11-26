package kakao_mobility2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

class Solution {

    public int solution(String[] id_list, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> check;
        StringTokenizer st;
        int answer = 0;

        for (int i = 0; i < id_list.length; i++) {
            st = new StringTokenizer(id_list[i], " ");
            check = new ArrayList<>();
            while (st.hasMoreTokens()) {
                String key = st.nextToken();
                if (map.get(key) != null && map.get(key) < k && !check.contains(key)) {
                    map.put(key, map.get(key) + 1);
                    answer++;
                    check.add(key);
                } else if (map.get(key) != null && map.get(key) >= k && !check.contains(key)) {
                    continue;
                } else {
                    if (!check.contains(key)) {
                        map.put(key, 1);
                        answer++;
                        check.add(key);
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution t = new Solution();

        String[] test = {"JAY", "JAY ELLE JAY MAY", "MAY ELLE MAY", "ELLE MAY", "ELLE ELLE ELLE",
            "MAY"};
        int k = sc.nextInt();

        System.out.println(t.solution(test, k));
    }
}
