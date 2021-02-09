package GeneralProgramming;

import java.io.File;

//Set Write Permission Of A File In Java

public class SetWritePerm {

	public static void main(String[] args) {
		File file = new File("I:\\temp.txt");
		if (file.exists()) {
			boolean result = file.setWritable(true);
			System.out.println("Is write permission for owner set successfully? " + result);
		} else {
			System.out.println("Sorry...File doesn't exist.");
		}

		if (file.exists()) {
			boolean result = file.setWritable(true, false);
			System.out.println("Is write permission for all set successfully? " + result);
		} else {
			System.out.println("Sorry...File doesn't exist.");
		}
	}
}
