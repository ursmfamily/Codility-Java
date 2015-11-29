package practice.java.counting;

import java.util.HashSet;
import java.util.Set;

public class EarliestTime {

	public static void main(String[] args) {
		System.out.println(new EarliestTime().solution(new int[] { 1, 3, 1, 4,
				2, 3, 5, 4 }, 5));

	}

	// https://codility.com/demo/results/trainingHTE9PV-MHD/
	// 100% Completeness and 100% performance
	private int solution(int[] A, int X) {
		Set<Integer> distinctJump = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			distinctJump.add(A[i]);
			if (distinctJump.size() == X) {
				return i;
			}
		}
		return -1;
	}

}
