package Dynamic_Programming;

/*Find minimum sum such that one of every three consecutive elements is taken
Given an array of n non-negative numbers, the task is to find the minimum sum of elements (picked from the array) such that at least one element is picked 
out of every 3 consecutive elements in the array.
Input : arr[] = {1, 2, 3}
Output : 1

Input : arr[] = {1, 2, 3, 6, 7, 1}
Output : 4
We pick 3 and 1  (3 + 1 = 4)
Time Complexity : O(n)
Auxiliary Space : O(n)*/

public class FindMinimumSum {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 20, 2, 10, 1 };
		int n = arr.length;
		System.out.println("Min Sum is " + findMinSum(arr, n)); //Min Sum is 4
	}

	static int findMinSum(int arr[], int n) {
		int sum[] = new int[n];
		sum[0] = arr[0];
		sum[1] = arr[1];
		sum[2] = arr[2];
		for (int i = 3; i < n; i++)
			sum[i] = arr[i] + minimum(sum[i - 3], sum[i - 2], sum[i - 1]);
		return minimum(sum[n - 1], sum[n - 2], sum[n - 3]);
	}

	static int minimum(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}
}
