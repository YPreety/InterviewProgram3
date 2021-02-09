package GeneralProgramming;

import java.io.IOException;

public class LaunchingExternalApps {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime(); // getting Runtime object
		String[] s = new String[] { "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe",
				"http://javaconceptoftheday.com/" };

		try {
			runtime.exec("notepad.exe"); // opens new notepad instance
			runtime.exec(s);
			// OR runtime.exec("notepad");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
