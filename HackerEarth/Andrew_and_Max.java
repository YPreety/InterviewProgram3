package HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*         Input
* 
*         First line contains T - number of test cases.
* 
*         Each of next T lines contains 3 integers, X, Y, Z, in that order. It
*         is guaranteed that numbers X, Y, Z are accurate and A, B, C form
*         dimensions of a prism.
* 
*         Output
* 
*         Output surface area of each original prism in a new line. Round your
*         answer to 2 decimal places.
* 
*/

public class Andrew_and_Max {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine().trim());
		while (T > 0) {
			if ((s = br.readLine().trim()) != null) {
				st = new StringTokenizer(s);
				long X = Long.parseLong(st.nextToken());
				long Y = Long.parseLong(st.nextToken());
				long Z = Long.parseLong(st.nextToken());
				double A = (double) (X - Y + Z) / 2;
				double B = X - A;
				double C = Y - B;
				double area = 2 * (A * B + B * C + C * A);
				System.out.printf("%.2f\n", area);
				T--;
			}
		}
		out.close();

	}

}
