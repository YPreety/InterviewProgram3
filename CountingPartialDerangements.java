package Dynamic_Programming;

//Recursive Java program to find n-th Rencontres Number
/*Rencontres Number (Counting partial derangements)
Input : n = 3, k = 0
Output : 2
Since k = 0, no point needs to be on its original position. So derangements are {3, 1, 2} and {2, 3, 1}
*/
public class CountingPartialDerangements {

	public static void main(String[] args) {
		int n = 7, m = 2;
		System.out.println(RencontresNumber(n, m)); //924
	}

	static int RencontresNumber(int n, int m) {
		if (n == 0 && m == 0)
			return 1;
		if (n == 1 && m == 0)
			return 0;
		if (m == 0)
			return (n - 1) * (RencontresNumber(n - 1, 0) + RencontresNumber(n - 2, 0));
		return binomialCoeff(n, m) * RencontresNumber(n - m, 0);
	}

	static int binomialCoeff(int n, int k) {
		if (k == 0 || k == n)
			return 1;
		return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
	}
}
