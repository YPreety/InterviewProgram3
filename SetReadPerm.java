package GeneralProgramming;

import java.io.File;

//Set Read Permission Of A File In Java

public class SetReadPerm {

	public static void main(String[] args) {
		File file = new File("I:\\temp.txt");
		if (file.exists()) {
			boolean result = file.setReadable(true);
			System.out.println("Is read permission for owner set successfully? " + result);
		} else {
			System.out.println("Sorry...File doesn't exist.");
		}

		if (file.exists()) {
			boolean result = file.setReadable(true, false);
			System.out.println("Is read permission for all set successfully? " + result);
		} else {
			System.out.println("Sorry...File doesn't exist.");
		}
	}
}
