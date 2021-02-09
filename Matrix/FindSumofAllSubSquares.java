package Matrix;

/*Given an n x n square matrix, find sum of all sub-squares of size k x k

Input:
n = 5, k = 3
arr[][] = { {1, 1, 1, 1, 1},
            {2, 2, 2, 2, 2},
            {3, 3, 3, 3, 3},
            {4, 4, 4, 4, 4},
            {5, 5, 5, 5, 5},
         };
Output:
       18  18  18
       27  27  27
       36  36  36
       Time complexity of above solution is O(k2n2).
 */
public class FindSumofAllSubSquares {

	static final int n = 5;
	public static void main(String[] args) {
		int mat[][] = { { 1, 1, 1, 1, 1 }, { 2, 2, 2, 2, 2 }, { 3, 3, 3, 3, 3 }, { 4, 4, 4, 4, 4 }, { 5, 5, 5, 5, 5 } };
		int k = 3;
		printSumSimple(mat, k);
	}

	static void printSumSimple(int mat[][], int k) {
		if (k > n)
			return;
		for (int i = 0; i < n - k + 1; i++) {
			for (int j = 0; j < n - k + 1; j++) {
				int sum = 0;
				for (int p = i; p < k + i; p++)
					for (int q = j; q < k + j; q++)
						sum += mat[p][q];
				System.out.print(sum + " ");
			}
			System.out.println();
		}
	}
}
