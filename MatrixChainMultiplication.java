package Dynamic_Programming;

/*Given a sequence of matrices, find the most efficient way to multiply these matrices together. 
The problem is not actually to perform the multiplications, but merely to decide in which order to perform the multiplications.

Overlapping Subproblems

Minimum number of multiplications is 30*/

public class MatrixChainMultiplication {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 3 };
		int n = arr.length;
		System.out.println("Minimum number of multiplications is " + MatrixChainOrder(arr, 1, n - 1));
	}

	static int MatrixChainOrder(int p[], int i, int j) {
		if (i == j)
			return 0;
		int min = Integer.MAX_VALUE;
		for (int k = i; k < j; k++) {
			int count = MatrixChainOrder(p, i, k) + MatrixChainOrder(p, k + 1, j) + p[i - 1] * p[k] * p[j];

			if (count < min)
				min = count;
		}
		return min;
	}
}
