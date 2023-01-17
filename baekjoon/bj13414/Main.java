package bj13414;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int count = 0;

        LinkedHashSet<String> set = new LinkedHashSet<>();

        for (int i = 0; i < l; i++) {
            String str = sc.next();
            set.remove(str);
            set.add(str);
        }
        for (String x : set) {
            count++;
            System.out.println(x);
            if (count == k) {
                break;
            }
        }
    }
}
