package Dynamic_Programming;

/*Given a set of non-negative integers, and a value sum, determine if there is a subset of the given set with sum equal to 
given sum.
Examples: set[] = {3, 34, 4, 12, 5, 2}, sum = 9
Output:  True */ //There is a subset (4, 5) with sum 9.
//A recursive solution for subset sum problem
public class SubsetSumProblem {

	public static void main(String[] args) {
		int set[] = { 3, 34, 4, 12, 5, 2 };
		int sum = 9;
		int n = set.length;
		if (isSubsetSum(set, n, sum) == true)
			System.out.println("Found a subset with given sum");//Found a subset with given sum
		else
			System.out.println("No subset with given sum");
	}

	static boolean isSubsetSum(int set[], int n, int sum) {
		if (sum == 0)
			return true;
		if (n == 0 && sum != 0)
			return false;
		if (set[n - 1] > sum)
			return isSubsetSum(set, n - 1, sum);
		return isSubsetSum(set, n - 1, sum) || isSubsetSum(set, n - 1, sum - set[n - 1]);
	}
}
