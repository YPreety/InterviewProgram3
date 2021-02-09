package HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Stack;

/*         Input constraints: The first line of input will contain an integer —
*         n. The next n lines will contain an integer, where the ith integer
*         represents the rating of the ith person.
* 
*         Output constraints: Print the required sum.
* 
*/

public class Biased_Chandan {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());
		Stack<Integer> st = new Stack<>();
		while (n-- > 0) {
			int num = Integer.parseInt(br.readLine().trim());
			if (num == 0 && !st.isEmpty()) {
				st.pop();
			} else {
				st.push(num);
			}

		}
		int sum = 0;
		for (int i : st) {
			sum += i;
		}
		out.println(sum);
		out.close();

	}
}
