package Dynamic_Programming;

/*Sum of average of all subsets
Given an array arr of N integer elements, the task is to find sum of average of all subsets of this array.
Input  : arr[] = [2, 3, 5]
Output : 23.33 */
public class SumAverageAllSubsets {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 5, 7 };
		int N = arr.length;
		System.out.println(resultOfAllSubsets(arr, N)); //63.75
	}

	static double resultOfAllSubsets(int arr[], int N) {
		double result = 0.0;
		int sum = 0;
		for (int i = 0; i < N; i++)
			sum += arr[i];
		for (int n = 1; n <= N; n++)
			result += (double) (sum * (nCr(N - 1, n - 1))) / n;
		return result;
	}

	static int nCr(int n, int k) {
		int C[][] = new int[n + 1][k + 1];
		int i, j;
		for (i = 0; i <= n; i++) {
			for (j = 0; j <= Math.min(i, k); j++) {
				if (j == 0 || j == i)
					C[i][j] = 1;
				else
					C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
			}
		}
		return C[n][k];
	}
}
