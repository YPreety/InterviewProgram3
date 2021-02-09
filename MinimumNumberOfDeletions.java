package Dynamic_Programming;

/*Minimum number of deletions to make a sorted sequence
Given an array of n integers. The task is to remove or delete minimum number of elements from the array so that when the remaining elements are placed in 
the same sequence order form a sorted sequence.
Input : {5, 6, 1, 7, 4}
Output : 2
Removing 1 and 4 leaves the remaining sequence order as 5 6 7 which is a sorted sequence.
Time Complexity: O(n2)*/

public class MinimumNumberOfDeletions {

	public static void main(String[] args) {
		int arr[] = { 30, 40, 2, 5, 1, 7, 45, 50, 8 };
		int n = arr.length;
		System.out.println("Minimum number of deletions = " + minimumNumberOfDeletions(arr, n)); //Minimum number of deletions = 4
	}

	static int minimumNumberOfDeletions(int arr[], int n) {
		int len = lis(arr, n);
		return (n - len);
	}

	static int lis(int arr[], int n) {
		int result = 0;
		int[] lis = new int[n];
		for (int i = 0; i < n; i++)
			lis[i] = 1;
		for (int i = 1; i < n; i++)
			for (int j = 0; j < i; j++)
				if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
					lis[i] = lis[j] + 1;
		for (int i = 0; i < n; i++)
			if (result < lis[i])
				result = lis[i];
		return result;
	}
}
