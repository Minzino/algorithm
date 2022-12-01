package greedy.problem0904;

import java.util.*;

class Day implements Comparable<Day> {

    public int money;
    public int day;

    Day(int money, int day) {
        this.money = money;
        this.day = day;
    }

    @Override
    public int compareTo(Day ob) {
        return ob.day - this.day;
    }
}

class Main {

    static int n, max = Integer.MIN_VALUE;

    public int solution(ArrayList<Day> arr) {
        int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        int j = 0;
        for (int i = max; i >= 1; i--) {
            for (; j < n; j++) {
                if (arr.get(j).day < i) {
                    break;
                }
                pQ.offer(arr.get(j).money);
            }
            if (!pQ.isEmpty()) {
                answer += pQ.poll();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<Day> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int money = sc.nextInt();
            int day = sc.nextInt();
            arr.add(new Day(money, day));
            if (day > max) {
                max = day;
            }
        }
        System.out.println(t.solution(arr));
    }
}
