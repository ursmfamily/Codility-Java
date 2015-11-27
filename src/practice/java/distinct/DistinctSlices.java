package practice.java.distinct;

/**
 * TapeEquilibrium solution for java.
 * 
 *
 */
public class DistinctSlices {
	public int solution(int[] A) {
		long totalSum = 0;
		long sum = A[0];
		long minDif = 0;
		for (int i = 1; i < A.length; i++) {
			totalSum += A[i];
		}
		minDif = Math.abs(A[0] - totalSum);
		for (int i = 1; i < A.length - 1; i++) {
			sum += A[i];
			totalSum = totalSum - A[i];
			long tempValue = Math.abs(sum - totalSum);
			if (minDif > tempValue) {
				minDif = tempValue;
			}
		}
		return (int) minDif;
	}
}
