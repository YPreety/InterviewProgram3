package GeneralProgramming;

import java.io.File;

// Set Execute Permission Of A File In Java

public class SetExecutePerm {

	public static void main(String[] args) {
		File file = new File("I:\\temp.txt");
		if (file.exists()) {
			boolean result = file.setExecutable(true);
			System.out.println("Is execute permission for owner set successfully? " + result);
		} else {
			System.out.println("Sorry...File doesn't exist.");
		}

		if (file.exists()) {
			boolean result = file.setExecutable(true, false);
			System.out.println("Is execute permission for all set successfully? " + result);
		} else {
			System.out.println("Sorry...File doesn't exist.");
		}
	}
}
