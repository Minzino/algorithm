package bj11650;

import java.io.*;
import java.util.*;

class Point implements Comparable<Point> {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public int compareTo(Point ob) {
        if (this.x == ob.x) {
            return this.y - ob.y;
        } else {
            return this.x - ob.x;
        }
    }
}

public class Main {

    static StringBuilder sb = new StringBuilder();

    private void solution(ArrayList<Point> points, int testCase) {
        Collections.sort(points);
        for (int i = 0; i < testCase; i++) {
            sb.append(points.get(i).x).append(" ").append(points.get(i).y).append("\n");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Main t = new Main();

        int testCase = Integer.parseInt(br.readLine());
        ArrayList<Point> points = new ArrayList<>();
        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            points.add(new Point(x, y));

        }
        t.solution(points, testCase);
        System.out.println(sb);
    }

}
