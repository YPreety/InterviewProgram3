package Dynamic_Programming;

/*Catalan numbers are a sequence of natural numbers that occurs in many interesting counting problems like following.

1) Count the number of expressions containing n pairs of parentheses which are correctly matched. For n = 3, 
possible expressions are ((())), ()(()), ()()(), (())(), (()()).
2) Count the number of possible Binary Search Trees with n keys (See this)
3) Count the number of full binary trees (A rooted binary tree is full if every vertex has either two children or 
no children) with n+1 leaves.
The first few Catalan numbers for n = 0, 1, 2, 3, � are 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, */
public class NthCatalanNumber {

	public static void main(String[] args) {
		NthCatalanNumber cn = new NthCatalanNumber();
		for (int i = 0; i < 10; i++) {
			System.out.print(cn.catalan(i) + " ");//1 1 2 5 14 42 132 429 1430 4862 
		}
	}

	int catalan(int n) {
		int res = 0;
		if (n <= 1) {
			return 1;
		}
		for (int i = 0; i < n; i++) {
			res += catalan(i) * catalan(n - i - 1);
		}
		return res;
	}
}
