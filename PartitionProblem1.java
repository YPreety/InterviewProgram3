package Dynamic_Programming;

/*Time Complexity: O(sum*n)
Auxiliary Space: O(sum*n)*/

public class PartitionProblem1 {

	public static void main(String[] args) {
		int arr[] = { 3, 1, 1, 2, 2, 1 };
		int n = arr.length;
		if (findPartition(arr, n) == true)
			System.out.println("Can be divided into two subsets of equal sum"); //Can be divided into two subsets of equal sum
		else
			System.out.println("Can not be divided into two subsets of equal sum");
	}

	static boolean findPartition(int arr[], int n) {
		int sum = 0;
		int i, j;
		for (i = 0; i < n; i++)
			sum += arr[i];
		if (sum % 2 != 0)
			return false;
		boolean part[][] = new boolean[sum / 2 + 1][n + 1];
		for (i = 0; i <= n; i++)
			part[0][i] = true;
		for (i = 1; i <= sum / 2; i++)
			part[i][0] = false;
		for (i = 1; i <= sum / 2; i++) {
			for (j = 1; j <= n; j++) {
				part[i][j] = part[i][j - 1];
				if (i >= arr[j - 1])
					part[i][j] = part[i][j] || part[i - arr[j - 1]][j - 1];
			}
		}
		return part[sum / 2][n];
	}
}
