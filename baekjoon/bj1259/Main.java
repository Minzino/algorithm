package bj1259;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNext()) {
            String number = sc.nextLine();
            if (Integer.parseInt(number) == 0) {
                break;
            }

            String answer = "yes";
            for (int i = 0; i < number.length() / 2; i++) {
                if (number.charAt(i) != (number.charAt(number.length() - 1 - i))) {
                    answer = "no";
                    break;
                }
            }
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }

}
