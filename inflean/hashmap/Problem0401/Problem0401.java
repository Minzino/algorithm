package hashmap.Problem0401;

import java.util.*;

class Problem0401 {

	public char solution(int n, String s) {
		char answer = ' ';
		HashMap<Character, Integer> map = new HashMap<>();
		for (char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}

		int max = Integer.MIN_VALUE;
		for (char key : map.keySet()) {
			if (map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Problem0401 t = new Problem0401();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(t.solution(n, str));
	}
}
