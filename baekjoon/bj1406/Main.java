package bj1406;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    static class Node {

        Node next;
        Node prev;
        char data;

        public Node(char data) {
            this.next = null;
            this.prev = null;
            this.data = data;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int testCase = Integer.parseInt(br.readLine());
        int strLen = str.length();

        Node[] editor = new Node[strLen + 1];
        editor[0] = new Node('_');

        for (int i = 1; i <= strLen; i++) {
            editor[i] = new Node(str.charAt(i - 1));
            editor[i].prev = editor[i - 1];
            editor[i - 1].next = editor[i];
        }

        Node now = editor[strLen];

        for (int i = 0; i < testCase; i++) {
            String commands = br.readLine();
            char c = commands.charAt(0);
            if (c == 'L') {
                if (now.prev != null) {
                    now = now.prev;
                }
            } else if (c == 'D') {
                if (now.next != null) {
                    now = now.next;
                }
            } else if (c == 'B') {
                if (now.prev != null) {
                    if (now.next == null) {
                        now.prev.next = null;
                    } else {
                        now.prev.next = now.next;
                        now.next.prev = now.prev;
                    }
                    now = now.prev;
                }
            } else if (c == 'P') {
                char text = commands.charAt(2);
                Node newNode = new Node(text);
                if (now.next != null) {
                    newNode.next = now.next;
                    newNode.prev = now;
                    now.next.prev = newNode;
                    now.next = newNode;
                } else {
                    now.next = newNode;
                    newNode.prev = now;
                    newNode.next = null;
                }
                now = newNode;
            }

        }

        Node printData = editor[0];
        while (true) {
            if (printData.data == '_') {
                printData = printData.next;
            }
            bw.append(printData.data);
            if (printData.next == null) {
                break;
            }
            printData = printData.next;
        }
        bw.flush();
        bw.close();
    }
}
