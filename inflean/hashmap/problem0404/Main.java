package hashmap.problem0404;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public int solution(String a, String b) {
		int answer = 0;
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();

		for (char x : b.toCharArray()) {
			map2.put(x, map2.getOrDefault(x, 0) + 1);
		}

		for (int i = 0; i < b.length() - 1; i++) {
			map1.put(a.charAt(i), map1.getOrDefault(a.charAt(i), 0) + 1);
		}

		int lt = 0;
		for (int rt = b.length() - 1; rt < a.length(); rt++) {
			map1.put(a.charAt(rt), map1.getOrDefault(a.charAt(rt), 0) + 1);
			if (map1.equals(map2)) {
				answer++;
			}
			map1.put(a.charAt(lt), map1.get(a.charAt(lt)) - 1);
			if (map1.get(a.charAt(lt)) == 0) {
				map1.remove(a.charAt(lt));
			}
			lt++;
		}
		return answer;
	}

	public static void main(String[] args) {
		Main t = new Main();
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();

		System.out.println(t.solution(a, b));
	}

}
