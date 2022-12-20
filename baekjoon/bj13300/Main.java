package bj13300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int rooms = 0;

        int[] male = new int[7];
        int[] female = new int[7];

        st = new StringTokenizer(br.readLine());
        int students = Integer.parseInt(st.nextToken());
        int capacity = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= students; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());

            if (gender == 0) {
                female[grade]++;
            }
            if (gender == 1) {
                male[grade]++;
            }
        }

        for (int i = 1; i < 7; i++) {
            if (male[i] == 1) {
                rooms++;
            }
            else if (male[i] % capacity == 0) {
                rooms += (male[i] / capacity);
            } else {
                rooms += (male[i] / capacity) + 1;
            }
        }
        for (int i = 1; i < 7; i++) {
            if (female[i] == 1) {
                rooms++;
            }
            else if (female[i] % capacity == 0) {
                rooms += (female[i] / capacity);
            } else {
                rooms += (female[i] / capacity) + 1;
            }
        }

        System.out.println(rooms);
    }

}
