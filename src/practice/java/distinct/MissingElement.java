package practice.java.distinct;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
		System.out.println(new MissingElement().solution(new int[] { 2, 3, 5,
				6, 4, 1 }));
	}

	// 100% solution
	public int solution(int[] A) {
		int min = 1;
		Arrays.sort(A);
		for (int i : A) {
			if (i > -1 && i == min) {
				min++;
			}
		}
		return min;
	}

	// 100% correctness 60% performance
	public int solution1(int[] A) {
		long missingSum = ((A.length + 1) * (A.length + 2)) / 2;
		for (int i = 0; i < A.length; i++) {
			missingSum -= A[i];
		}
		return (int) missingSum;
	}
}
