package Dynamic_Programming;

/*Minimum insertions to sort an array
Given an array of integer numbers, we need to sort this array in a minimum number of steps where in one step we can insert any array element from its 
position to any other position.
Input  : arr[] = [2, 3, 5, 1, 4, 7, 6]
Output : 3
We can sort above array in 3 insertion steps as shown below,
1 before array value 2
4 before array value 5
6 before array value 7
*/
public class MinimumInsertionsSortArray {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 5, 1, 4, 7, 6 };
		int N = arr.length;
		System.out.println(minInsertionStepToSortArray(arr, N)); //3
	}

	static int minInsertionStepToSortArray(int arr[], int N) {
		int[] lis = new int[N];
		for (int i = 0; i < N; i++)
			lis[i] = 1;
		for (int i = 1; i < N; i++)
			for (int j = 0; j < i; j++)
				if (arr[i] >= arr[j] && lis[i] < lis[j] + 1)
					lis[i] = lis[j] + 1;
		int max = 0;
		for (int i = 0; i < N; i++)
			if (max < lis[i])
				max = lis[i];
		return (N - max);
	}
}
