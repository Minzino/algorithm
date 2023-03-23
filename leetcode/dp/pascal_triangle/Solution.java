package leetcode.dp.pascal_triangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j = 1; j < i; j++) {
                int value = rows.get(i-1).get(j-1) + rows.get(i-1).get(j);
                row.add(value);
            }

            if (i > 0) {
                row.add(1);
            }
            rows.add(row);
        }
        return rows;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }

}
