package Dynamic_Programming;

/*Minimum number of jumps to reach end :- Given an array of integers where each element represents the max number of steps that 
can be made forward from that element. Write a function to return the minimum number of jumps to reach the end of the array
(starting from the first element). If an element is 0, then cannot move through that element.
Input: arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
Output: 3 (1-> 3 -> 8 ->9)

Method 1 (Naive Recursive Approach)
*/
public class MinimumNumberOfJumps {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 6, 3, 2, 3, 6, 8, 9, 5 };
		int n = arr.length;
		System.out.print("Minimum number of jumps to reach end is " + minJumps(arr, 0, n - 1));
		//Minimum number of jumps to reach end is 4
	}

	static int minJumps(int arr[], int l, int h) {
		if (h == l)
			return 0;
		if (arr[l] == 0)
			return Integer.MAX_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = l + 1; i <= h && i <= l + arr[l]; i++) {
			int jumps = minJumps(arr, i, h);
			if (jumps != Integer.MAX_VALUE && jumps + 1 < min)
				min = jumps + 1;
		}
		return min;
	}
}
