package HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*         Input: The first line contains one integer, Q, the number of test
*         cases. The next Q lines contain two integers, N and T.
* 
*         Output: Output Q lines, the answer for each test case.
* 
*/

public class Children_Love_Candies {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		StringTokenizer st;
		int Q = Integer.parseInt(br.readLine().trim());
		while (Q > 0) {
			if ((s = br.readLine().trim()) != null) {
				st = new StringTokenizer(s);
				long N = Long.parseLong(st.nextToken());
				int T = Integer.parseInt(st.nextToken());
				while (T-- > 0) {
					long taken = (N & 1) == 0 ? N / 2 : (N + 1) / 2;
					N -= taken;
					N -= N / 4;
				}
				out.println(N);
				Q--;
			}
		}
		out.close();

	}

}
