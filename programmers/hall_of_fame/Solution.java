package hall_of_fame;

import java.util.*;

class Solution {

    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {

            priorityQueue.add(score[i]);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }

            answer[i] = priorityQueue.peek();
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> scores = new ArrayList<>();
        Solution t = new Solution();

        int lowest = sc.nextInt();

        while (sc.hasNextInt()) {
            scores.add(sc.nextInt());
        }

        Integer[] arr = scores.toArray(new Integer[0]);

        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }

        t.solution(lowest, arr1);

    }
}
