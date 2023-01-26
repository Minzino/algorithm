package bj1197;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Node implements Comparable<Node> {

    int a;
    int b;
    int cost;

    public Node(int a, int b, int cost) {
        this.a = a;
        this.b = b;
        this.cost = cost;
    }

    @Override
    public int compareTo(Node o) {
        return this.cost - o.cost;
    }
}

public class Main {

    static int[] unf;

    public static int find(int v) {
        if (v == unf[v]) {
            return v;
        } else {
            return unf[v] = find(unf[v]);
        }
    }

    public static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) {
            unf[fa] = fb; //a와 b의 연결
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        unf = new int[v + 1];
        ArrayList<Node> arr = new ArrayList<>();

        for (int i = 1; i <= v; i++) {
            unf[i] = i;
        }

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            arr.add(new Node(a, b, c));
        }

        int answer = 0;
        Collections.sort(arr);

        for (Node ob : arr) {
            int fa = find(ob.a);
            int fb = find(ob.b);
            if (fa != fb) { // 서로 가르키는 경로가 다를때 서로 연결 else는 1 -> 3 , 3 -> 3 루프는 필요없으므로 넘어감
                answer += ob.cost;
                union(ob.a, ob.b); // 노드에 대한 연결
            }
        }
        System.out.println(answer);
    }

}
