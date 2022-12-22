package barkingdog.stack.exercise1;

import java.util.Arrays;

public class Main {

    static int mx = 10;
    static int[] dat = new int[mx];
    static int pos = 0;

    void push(int x) {
        dat[pos++] = x;
        System.out.println(Arrays.toString(dat));
    }

    void pop() {
        pos--;
        System.out.println(Arrays.toString(dat));
    }

    int top() {
        return dat[pos - 1];
    }

    void test() {
        push(30);
        push(40);
        push(50);
        pop();
        push(60);
        System.out.println(top());
    }

    public static void main(String[] args) {
        Main t = new Main();
        t.test();
    }

}
