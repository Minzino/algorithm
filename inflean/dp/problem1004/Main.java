package dp.problem1004;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class Brick implements Comparable<Brick> {

    public int area, height, weight;

    Brick(int area, int height, int weight) {
        this.area = area;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Brick o) {
        return o.area - this.area;
    }
}

public class Main {

    static int[] dy;

    public static void main(String[] args) {
        Main t = new Main();
        Scanner sc = new Scanner(System.in);
        ArrayList<Brick> arr = new ArrayList<>();
        int testCase = sc.nextInt();
        dy = new int[testCase];

        for (int i = 0; i < testCase; i++) {
            int area = sc.nextInt();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            arr.add(new Brick(area, height, weight));
        }
        System.out.print(t.solution(arr));
    }

    private int solution(ArrayList<Brick> arr) {
        int answer = 0;
        Collections.sort(arr);

        dy[0] = arr.get(0).height;
        for (int i = 1; i < arr.size(); i++) {
            int max_height = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr.get(j).weight > arr.get(i).weight && dy[j] > max_height) {
                    max_height = dy[j];
                }
            }
            dy[i] = max_height + arr.get(i).height;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }
}
