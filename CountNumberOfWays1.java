package Dynamic_Programming;

import java.util.Arrays;

/*Count number of ways to jump to reach end :- Given an array of numbers where each element represents the max number of jumps that can be made forward from
that element. For each array element, count number of ways jumps can be made from that element to reach the end of the array. If an element is 0, 
then move cannot be made through that element. The element that cannot reach to the end should have a count “-1”.
Input : {3, 2, 0, 1}
Output : 2 1 -1 0
Time Complexity: O(n2) in worst case.
*/
public class CountNumberOfWays1 {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 8, 9, 1, 0, 7, 6, 8, 9 };
		int n = arr.length;
		countWaysToJump(arr, n);
	}

	static void countWaysToJump(int arr[], int n) {
		int count_jump[] = new int[n];
		Arrays.fill(count_jump, 0);
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] >= n - i - 1)
				count_jump[i]++;
			for (int j = i + 1; j < n - 1 && j <= arr[i] + i; j++)
				if (count_jump[j] != -1)
					count_jump[i] += count_jump[j];
			if (count_jump[i] == 0)
				count_jump[i] = -1;
		}
		for (int i = 0; i < n; i++)
			System.out.print(count_jump[i] + " "); //52 52 28 16 8 -1 -1 4 2 1 0 
	}
}
