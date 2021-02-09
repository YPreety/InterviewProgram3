package GeneralProgramming;

import java.text.SimpleDateFormat;
import java.util.Date;

//Pattern 8 : dd-MMM-yyyy HH:mm:ss Z (Ex : 10-Sep-2016 19:01:39 +0530)
public class FormatDate8 {

	public static void main(String[] args) {

		Date today = new Date();
		System.out.println("Today is : " + today);
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss Z");
		System.out.println("Today in dd-MMM-yyyy HH:mm:ss Z format : " + formatter.format(today));
	}
}
