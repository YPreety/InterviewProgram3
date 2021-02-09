package HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

/*         Input :
	 * 
	 *         First line consists of N, the number of names of customers in Chotu's
	 *         initial list. The next N lines are such that each line consists of a
	 *         customer's name.
	 * 
	 *         Output :
	 * 
	 *         On the first line, print the total number of names appearing in
	 *         Chotu's final list. Then print the list such that every customer's
	 *         name is printed on a new line.
	 * 
	 */

public class Vada_Pav_List {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder s1 = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		TreeSet<String> set = new TreeSet<>();
		String s;
		while (N > 0) {
			if ((s = br.readLine().trim()) != null) {
				set.add(s);
				N--;
			}
		}
		for (String s2 : set) {
			s1.append(s2 + "\n");
		}
		System.out.println(set.size());
		System.out.println(s1);
	}

}
