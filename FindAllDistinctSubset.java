package Dynamic_Programming;

import java.util.HashSet;

/*Find all distinct subset (or subsequence) sums of an array
Given a set of integers, find distinct sum that can be generated from the subsets of the given sets and print them in an increasing order. 
It is given that sum of array elements is small.
Input  : arr[] = {1, 2, 3}
Output : 0 1 2 3 4 5 6
Distinct subsets of given set are
{}, {1}, {2}, {3}, {1,2}, {2,3}, 
{1,3} and {1,2,3}.  Sums of these
subsets are 0, 1, 2, 3, 3, 5, 4, 6
After removing duplicates, we get
0, 1, 2, 3, 4, 5, 6  
The naive solution 
*/
public class FindAllDistinctSubset {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 6 };
		int n = arr.length;
		printDistSum(arr, n);
	}

	static void printDistSum(int arr[], int n) {
		HashSet<Integer> s = new HashSet<>();
		distSumRec(arr, n, 0, 0, s);
		for (int i : s)
			System.out.print(i + " "); //0 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 20 
	}

	static void distSumRec(int arr[], int n, int sum, int currindex, HashSet<Integer> s) {
		if (currindex > n)
			return;
		if (currindex == n) {
			s.add(sum);
			return;
		}
		distSumRec(arr, n, sum + arr[currindex], currindex + 1, s);
		distSumRec(arr, n, sum, currindex + 1, s);
	}
}
