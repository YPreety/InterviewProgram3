package HackerEarth;

import java.util.ArrayList;
import java.util.Scanner;

public class FakeName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c[] = s.toCharArray();
		ArrayList<Character> res = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			res.add(c[i]);
		}
		char r[] = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			int mid = (res.size() - 1) / 2;
			r[i] = res.get(mid);
			res.remove(mid);
		}
		String fake = new String(r);
		System.out.println(fake);

	}

}
