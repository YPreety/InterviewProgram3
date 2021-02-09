package Dynamic_Programming;

/*Count possible ways to construct buildings:- Given an input number of sections and each section has 2 plots on either sides of the road. 
Find all possible ways to construct buildings in the plots such that there is a space between any 2 buildings.

Time complexity: O(N) Auxiliary Space: O(1)
N = 1
Output = 4
Place a building on one side.
Place a building on other side
Do not place any building.
Place a building on both sides.

N = 3 
Output = 25
3 sections, which means possible ways for one side are BSS, BSB, SSS, SBS, SSB where B represents a building 
and S represents an empty space Total possible ways are 25, because a way to place on one side can correspond to any of 5 ways on other side.*/

public class CountPossibleWays {

	public static void main(String[] args) {
		int N = 3;
		System.out.println("Count of ways for " + N + " sections is " + countWays(N)); //Count of ways for 3 sections is 25
	}

	static int countWays(int N) {
		if (N == 1)
			return 4; // 2 for one side and 4 for two sides
		int countB = 1, countS = 1, prev_countB, prev_countS;
		for (int i = 2; i <= N; i++) {
			prev_countB = countB;
			prev_countS = countS;
			countS = prev_countB + prev_countS;
			countB = prev_countS;
		}
		int result = countS + countB;
		return (result * result);
	}
}
