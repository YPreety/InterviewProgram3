package HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*         Input: The first line contains an integer T, the number of test
*         cases. The next T lines contains two space-separated integers, R and
*         K. Output: Output T lines, the answer for each test case.
* 
*/

public class Very_Cool_Numbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		StringTokenizer st;
		int count[] = new int[100001];
		for (int i = 5; i < count.length; i++) {
			String binary = Integer.toBinaryString(i);
			int c = 0;
			for (int j = 0; j <= binary.length() - 3; j++) {
				if (binary.substring(j, j + 3).equals("101")) {
					c++;
				}
			}
			count[i] = c;
		}
		int T = Integer.parseInt(br.readLine().trim());
		while (T > 0) {
			if ((s = br.readLine().trim()) != null) {
				st = new StringTokenizer(s);
				int R = Integer.parseInt(st.nextToken());
				int K = Integer.parseInt(st.nextToken());
				int c1 = 0;
				for (int i = 5; i <= R; i++) {
					if (count[i] >= K) {
						c1++;
					}
				}
				out.println(c1);
				T--;
			}
		}
		out.close();
	}
}
