package Dynamic_Programming;

/*Probability of getting at least K heads in N tosses of Coins
Given N number of coins, the task is to find probability of getting at least K number of heads after tossing all the N coins simultaneously.
Suppose we have 3 unbiased coins and we have to
find the probability of getting at least 2 heads,
so there are 23 = 8 ways to toss these
coins, i.e.,
HHH, HHT, HTH, HTT, THH, THT, TTH, TTT 

Out of which there are 4 set which contain at
least 2 Heads i.e.,
HHH, HHT, HH, THH

So the probability is 4/8 or 0.5
Time Complexity: O(n) where n < 20
Auxiliary space: O(n)
*/
public class Probability {

	public static double fact[];

	public static void main(String[] args) {
		fact = new double[100];
		precompute();
		System.out.println(probability(2, 3));//0.5
		System.out.println(probability(3, 6));//0.65625
		System.out.println(probability(12, 18));//0.1189422607421875
	}

	public static void precompute() {
		fact[0] = fact[1] = 1;
		for (int i = 2; i < 20; ++i)
			fact[i] = fact[i - 1] * i;
	}

	public static double probability(int k, int n) {
		double ans = 0;
		for (int i = k; i <= n; ++i)
			ans += fact[n] / (fact[i] * fact[n - i]);
		ans = ans / (1 << n);
		return ans;
	}
}
