package bj10814;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Person {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return age + " " + name + "\n";
    }
}

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int users = Integer.parseInt(br.readLine());

        Person[] person = new Person[users];


        for(int i = 0; i < users; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            person[i] = new Person(age, name);
        }

        Arrays.sort(person, Comparator.comparingInt(s -> s.age));

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < users; i++) {
            sb.append(person[i]);
        }

        System.out.println(sb);

    }
}
