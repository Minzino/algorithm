package jobda;

import java.util.*;

class Solution {
    public String solution(String S) {
        String stringWithoutComments = removeComments(S);
        return isBracketsBalanced(stringWithoutComments) ? "TRUE" : "FALSE";
    }

    private String removeComments(String S) {
        String result = "";
        boolean inComment = false;

        for (int i = 0; i < S.length(); i++) {
            if (i < S.length() - 1 && S.charAt(i) == '/' && S.charAt(i + 1) == '*') {
                inComment = true;
                i++;
            } else if (i < S.length() - 1 && S.charAt(i) == '*' && S.charAt(i + 1) == '/') {
                inComment = false;
                i++;
            } else if (!inComment && isBracket(S.charAt(i))) {
                result += S.charAt(i);
            }
        }

        return result;
    }

    private boolean isBracket(char c) {
        return c == '(' || c == ')' || c == '[' || c == ']' || c == '{' || c == '}';
    }

    private boolean isBracketsBalanced(String S) {
        Map<Character, Character> bracketPairs = new HashMap<>();
        bracketPairs.put('(', ')');
        bracketPairs.put('[', ']');
        bracketPairs.put('{', '}');
        Stack<Character> stack = new Stack<>();

        for(char c : S.toCharArray()) {
            if(bracketPairs.containsKey(c)) {
                stack.push(c);
            } else if(bracketPairs.containsValue(c)) {
                if(stack.isEmpty() || bracketPairs.get(stack.pop()) != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String S = "(/*()}[*/)";
        String expected = "TRUE";
        String result = sol.solution(S);
        System.out.println(expected.equals(result) ? "CORRECT" : "WRONG");

        S = "(/*(){}*/)[]";
        expected = "TRUE";
        result = sol.solution(S);
        System.out.println(expected.equals(result) ? "CORRECT" : "WRONG");

        S = "([])[/*/*]()]";
        expected = "FALSE";
        result = sol.solution(S);
        System.out.println(expected.equals(result) ? "CORRECT" : "WRONG");

        S = "([{(){}[]})]";
        expected = "FALSE";
        result = sol.solution(S);
        System.out.println(expected.equals(result) ? "CORRECT" : "WRONG");

        S = "(/*(){})[*/]";
        expected = "FALSE";
        result = sol.solution(S);
        System.out.println(expected.equals(result) ? "CORRECT" : "WRONG");
    }
}
