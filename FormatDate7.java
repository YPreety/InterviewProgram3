package GeneralProgramming;

import java.text.SimpleDateFormat;
import java.util.Date;

//Pattern 7 : dd-MMM-yyyy HH:mm:ss z (Ex : 10-Sep-2016 18:49:53 IST)
public class FormatDate7 {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println("Today is : " + today);
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss z");
		System.out.println("Today in dd-MMM-yyyy HH:mm:ss z format : " + formatter.format(today));
	}
}
