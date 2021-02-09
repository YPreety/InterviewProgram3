package Dynamic_Programming;

/*Count number of ways to partition a set into k subsets
Given two numbers n and k where n represents number of elements in a set, find number of ways to partition the set into k subsets.
Input: n = 3, k = 2
Output: 3
Explanation: Let the set be {1, 2, 3}, we can partition
             it into 2 subsets in following ways
             {{1,2}, {3}},  {{1}, {2,3}},  {{1,3}, {2}}  

Input: n = 3, k = 1
Output: 1
Explanation: There is only one way {{1, 2, 3}}*/

public class waysToPartition {

	public static void main(String[] args) {
		System.out.println(countP(3, 2));  //3
	}

	public static int countP(int n, int k) {
		if (n == 0 || k == 0 || k > n)
			return 0;
		if (k == 1 || k == n)
			return 1;
		// S(n+1, k) = k*S(n, k) + S(n, k-1)
		return (k * countP(n - 1, k) + countP(n - 1, k - 1));
	}
}
