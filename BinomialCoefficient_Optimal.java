package Dynamic_Programming;

/*Write a function that takes two parameters n and k and returns the value of Binomial Coefficient C(n, k). 
For example, your function should return 6 for n = 4 and k = 2, and it should return 10 for n = 5 and k = 2.*/

public class BinomialCoefficient_Optimal {

	public static void main(String[] args) {
		int n = 5, k = 2;
		System.out.printf("Value of C(%d, %d) is %d ", n, k, binomialCoeff(n, k));
	}

	static int binomialCoeff(int n, int k) {
		if (k == 0 || k == n)
			return 1;
		return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
	}
}
