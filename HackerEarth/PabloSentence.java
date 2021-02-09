package HackerEarth;

import java.util.ArrayList;
import java.util.Scanner;

public class PabloSentence {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		ArrayList<Character> vowel = new ArrayList<Character>();
		vowel.add('a');
		vowel.add('e');
		vowel.add('i');
		vowel.add('o');
		vowel.add('u');
		while (T > 0) {
			System.out.println(T);
			String str = sc.next();
			long ans = 0;
			long vowels = 0;
			for (int i = 0; i < str.length(); i++) {
				if (!(vowel.contains(str.charAt(i)))) {
					ans += vowels;
				} else {
					vowels++;
				}
			}
			long con = 0;
			for (int i = 0; i < str.length(); i++) {
				if (!(vowel.contains(str.charAt(i)))) {
					con++;
				} else {
					ans += con;
				}
			}
			System.out.println(ans);
			T--;
		}
	}

}
