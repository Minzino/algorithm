package bj1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Time implements Comparable<Time> {

    int start;
    int end;

    public Time(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Time o) {
        if (this.end == o.end) {
            return this.start - o.start;
        } else {
            return this.end - o.end;
        }

    }
}

public class Main {

    public static int solution(ArrayList<Time> arr) {
        int cnt = 0;
        int endTime = 0;
        Collections.sort(arr);
        for (Time nextReserve : arr) {
            if (nextReserve.start >= endTime) {
                cnt++;
                endTime = nextReserve.end;
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int reserves = Integer.parseInt(br.readLine());
        ArrayList<Time> arr = new ArrayList<>();

        for (int i = 0; i < reserves; i++) {
            st = new StringTokenizer(br.readLine());
            arr.add(new Time(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        System.out.println(solution(arr));
    }

}
