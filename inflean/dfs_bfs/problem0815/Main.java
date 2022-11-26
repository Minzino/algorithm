package dfs_bfs.problem0815;


import java.util.ArrayList;
import java.util.Scanner;

class Point {

    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    static int n, m, length, answer = Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<Point> house, pizza;

    public void DFS(int L, int s) {
        if (L == m) {
            int sum = 0;
            for (Point h : house) {
                int dis = Integer.MAX_VALUE;
                for (int i : combi) {
                    dis = Math.min(dis,
                        Math.abs(h.x - pizza.get(i).x) + Math.abs(h.y - pizza.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = s; i < length; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pizza = new ArrayList<>();
        house = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = sc.nextInt();
                if (tmp == 1) {
                    house.add(new Point(i, j));
                } else if (tmp == 2) {
                    pizza.add(new Point(i, j));
                }
            }
        }
        length = pizza.size();
        combi = new int[m];
        t.DFS(0, 0);
        System.out.println(answer);
    }
}
