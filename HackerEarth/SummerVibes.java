package HackerEarth;

import java.util.ArrayList;
import java.util.Scanner;

public class SummerVibes {

	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		int rooms = sc.nextInt();
		ArrayList<String> reg = new ArrayList<String>();
		reg.add(0, "A");
		reg.add(1, "B");
		reg.add(2, "C");
		reg.add(3, "D");
		reg.add(4, "E");
		reg.add(5, "F");
		reg.add(6, "G");
		reg.add(7, "H");
		reg.add(8, "I");
		reg.add(9, "J");
		int ans = 0;
		int check = 0;
		for (int p = 1; p <= rooms; p++) {
			String temp = sc.next();
			if (temp.length() == 6) {
				check++;
				int realval = 0;
				for (int i = 0; i < temp.length(); i++) {
					int mult = 0;
					if (i < 5) {
						if (temp.charAt(i) == 'J' && temp.charAt(i + 1) == 'A')
							mult = reg.indexOf("A");
						else if (temp.charAt(i) == 'I' && temp.charAt(i + 1) == 'B')
							mult = reg.indexOf("B");
						else if (temp.charAt(i) == 'H' && temp.charAt(i + 1) == 'C')
							mult = reg.indexOf("C");
						else if (temp.charAt(i) == 'G' && temp.charAt(i + 1) == 'D')
							mult = reg.indexOf("D");
						else if (temp.charAt(i) == 'F' && temp.charAt(i + 1) == 'E')
							mult = reg.indexOf("E");
						else {
							String g = "" + temp.charAt(i);
							mult = reg.indexOf(g);
						}
					} else {
						String g = "" + temp.charAt(i);
						mult = reg.indexOf(g);
					}
					realval = realval * 10 + mult;
				}
				ans = ans + realval;
			}
		}
		if (check == rooms) {
			int original = sc.nextInt();
			if (ans > original) {
				System.out.println("GREEDY");
				System.out.println(ans - original);
			} else {
				System.out.println("INNOCENT");
			}
		}
	}
}
