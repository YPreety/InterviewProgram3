package Dynamic_Programming;

/*Minimum time to finish tasks without skipping two consecutive
Given time taken by n tasks. Find the minimum time needed to finish the tasks such that skipping of tasks is allowed, but can not skip two 
consecutive tasks.
Input : arr[] = {10, 30}
Output : 10

Input : arr[] = {10, 5, 2, 4, 8, 6, 7, 10}
Output : 22
Expected Time Complexity is O(n) and extra space is O(1).
*/
public class MinimumTimeToFinishTasks {

	public static void main(String[] args) {
		int arr1[] = { 10, 5, 2, 7, 10 };
		int n1 = arr1.length;
		System.out.println(minTime(arr1, n1)); //12

		int arr2[] = { 10, 5, 7, 10 };
		int n2 = arr2.length;
		System.out.println(minTime(arr2, n2)); //12

		int arr3[] = { 10, 5, 2, 4, 8, 6, 7, 10 }; //12
		int n3 = arr3.length;
		System.out.println(minTime(arr3, n3));
	}

	static int minTime(int arr[], int n) {
		if (n <= 0)
			return 0;
		int incl = arr[0];
		int excl = 0;
		for (int i = 1; i < n; i++) {
			int incl_new = arr[i] + Math.min(excl, incl);
			int excl_new = incl;
			incl = incl_new;
			excl = excl_new;
		}
		return Math.min(incl, excl);
	}
}
