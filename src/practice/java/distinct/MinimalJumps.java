package practice.java.distinct;

/**
 * Frog Jumps for java
 *
 */
public class MinimalJumps {
	public static void main(String[] args) {
		System.out.println(new MinimalJumps().solution(10, 85, 30));
	}

	// 100% performance 100% Correctness
	public int solution(int X, int Y, int D) {
		if ((Y - X) % D == 0) {
			return (Y - X) / D;
		} else {
			return ((Y - X) / D) + 1;
		}
	}
}
