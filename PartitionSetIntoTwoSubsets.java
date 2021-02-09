package Dynamic_Programming;

/*Recursive Solution:-

Partition a set into two subsets such that the difference of subset sums is minimum
Given a set of integers, the task is to divide it into two sets S1 and S2 such that the absolute difference between their sums is minimum.
Input:  arr[] = {1, 6, 11, 5} 
Output: 1
Explanation:
Subset1 = {1, 5, 6}, sum of Subset1 = 12 
Subset2 = {11}, sum of Subset2 = 11  */

public class PartitionSetIntoTwoSubsets {

	public static void main(String[] args) {
		int arr[] = { 3, 1, 4, 2, 2, 1 };
		int n = arr.length;
		System.out.print("The minimum difference" + " between two sets is " + findMin(arr, n)); //1
	}

	public static int findMin(int arr[], int n) {
		int sumTotal = 0;
		for (int i = 0; i < n; i++)
			sumTotal += arr[i];
		return findMinRec(arr, n, 0, sumTotal);
	}

	public static int findMinRec(int arr[], int i, int sumCalculated, int sumTotal) {
		if (i == 0)
			return Math.abs((sumTotal - sumCalculated) - sumCalculated);
		return Math.min(findMinRec(arr, i - 1, sumCalculated + arr[i - 1], sumTotal),
				findMinRec(arr, i - 1, sumCalculated, sumTotal));
	}
}
