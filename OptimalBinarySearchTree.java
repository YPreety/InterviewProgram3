package Dynamic_Programming;

//Overlapping Subproblems
/*Example 1
Input:  keys[] = {10, 12}, freq[] = {34, 50}
There can be following two possible BSTs 
        10                       12
          \                     / 
           12                 10
          I                     II
Frequency of searches of 10 and 12 are 34 and 50 respectively.
The cost of tree I is 34*1 + 50*2 = 134
The cost of tree II is 50*1 + 34*2 = 118 */

public class OptimalBinarySearchTree {

	public static void main(String[] args) {
		int keys[] = { 10, 12, 20 };
		int freq[] = { 34, 8, 50 };
		int n = keys.length;
		System.out.println("Cost of Optimal BST is " + optimalSearchTree(keys, freq, n)); //Cost of Optimal BST is 142
	}

	static int optimalSearchTree(int keys[], int freq[], int n) {
		return optCost(freq, 0, n - 1);
	}

	static int optCost(int freq[], int i, int j) {
		if (j < i) // no elements in this subarray
			return 0;
		if (j == i) // one element in this subarray
			return freq[i];
		int fsum = sum(freq, i, j);
		int min = Integer.MAX_VALUE;
		for (int r = i; r <= j; ++r) {
			int cost = optCost(freq, i, r - 1) + optCost(freq, r + 1, j);
			if (cost < min)
				min = cost;
		}
		return min + fsum;
	}

	static int sum(int freq[], int i, int j) {
		int s = 0;
		for (int k = i; k <= j; k++)
			s += freq[k];
		return s;
	}
}
