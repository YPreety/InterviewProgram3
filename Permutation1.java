package Dynamic_Programming;

//A Dynamic programming based 
public class Permutation1 {

	public static void main(String[] args) {
		int n = 4;
		System.out.println("Count of Derangements is " + countDer(n)); //Count of Derangements is 9
	}

	static int countDer(int n) {
		int der[] = new int[n + 1];
		der[0] = 1;
		der[1] = 0;
		der[2] = 1;
		for (int i = 3; i <= n; ++i)
			der[i] = (i - 1) * (der[i - 1] + der[i - 2]);
		return der[n];
	}
}
