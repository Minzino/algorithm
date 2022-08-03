package epi;

/*
4.2 비트 스왑
64비트 정수가 주어졌을 때 i번쨰 비트와 j번째 비트를 스왑(swap)하는 코드를 작성하라.
 */
public class Problem4_2 {

	public static long swapBits(long x, int i, int j) {
		//i번째 비트와 j번째 비트가 다른지 확인한다.
		if (((x >>> i) & 1) != ((x >>> j) & 1)) {
			//i번째 비트와 j번째 비트가 다르다면, 각 비트를 뒤집어서 스왑을 구현한다.
			//bitMask를 사용해서 뒤집을 비트를 선택한다. x = 1일 때 x^1 = 0을 만족하고,
			//x = 0일 때 x^1 = 0을 만족하므로, XOR를 사용해서 비트를 뒤집을 수 있다.
			long bitMask = (1L << i) | (1L << j);
			x ^= bitMask;
		}
		return x;
	}

}
