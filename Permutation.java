package Dynamic_Programming;

/*A Derangement is a permutation of n elements, such that no element appears in its original position. 
For example, a derangement of {0, 1, 2, 3} is {2, 3, 1, 0}.
Count Derangements (Permutation such that no element appears in its original position)
Input: n = 2
Output: 1
For two elements say {0, 1}, there is only one 
possible derangement {1, 0}
Time Complexity: T(n) = T(n-1) + T(n-2) which is exponential.*/

public class Permutation {

	public static void main(String[] args) {
		int n = 4;
		System.out.println("Count of Derangements is " + countDer(n)); //Count of Derangements is 9
	}

	static int countDer(int n) {
		if (n == 1)
			return 0;
		if (n == 0)
			return 1;
		if (n == 2)
			return 1;
		// countDer(n) = (n-1)[countDer(n-1) + der(n-2)]
		return (n - 1) * (countDer(n - 1) + countDer(n - 2));
	}
}
