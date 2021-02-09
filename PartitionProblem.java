package Dynamic_Programming;

/*Partition problem is to determine whether a given set can be partitioned into two subsets such that the sum of elements in both subsets is same.
arr[] = {1, 5, 11, 5}
Output: true 
The array can be partitioned as {1, 5, 5} and {11}

arr[] = {1, 5, 3}
Output: false 
The array cannot be partitioned into equal sum sets.

Time Complexity: O(2^n) In worst case*/
public class PartitionProblem {

	public static void main(String[] args) {
		int arr[] = { 3, 1, 5, 9, 12 };
		int n = arr.length;
		if (findPartition(arr, n) == true)
			System.out.println("Can be divided into two " + "subsets of equal sum"); //Can be divided into two subsets of equal sum
		else
			System.out.println("Can not be divided into " + "two subsets of equal sum"); 
	}

	static boolean isSubsetSum(int arr[], int n, int sum) {
		if (sum == 0)
			return true;
		if (n == 0 && sum != 0)
			return false;
		if (arr[n - 1] > sum)
			return isSubsetSum(arr, n - 1, sum);
		return isSubsetSum(arr, n - 1, sum) || isSubsetSum(arr, n - 1, sum - arr[n - 1]);
	}
	static boolean findPartition(int arr[], int n) {
		int sum = 0;
		for (int i = 0; i < n; i++)
			sum += arr[i];
		if (sum % 2 != 0)
			return false;
		return isSubsetSum(arr, n, sum / 2);
	}
}
