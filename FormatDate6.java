package GeneralProgramming;

import java.text.SimpleDateFormat;
import java.util.Date;

//Pattern 6 : EEEE, MMM dd yyyy, hh:mm:ss a (Ex : Saturday, Sep 10 2016, 06:45:51 PM)
public class FormatDate6 {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println("Today is : " + today);
		SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMM dd yyyy, hh:mm:ss a");
		System.out.println("Today in EEEE, MMM dd yyyy, hh:mm:ss a format : " + formatter.format(today));
	}
}
