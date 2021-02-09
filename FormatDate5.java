package GeneralProgramming;

import java.text.SimpleDateFormat;
import java.util.Date;

//Pattern 5 : dd-MMM-yyyy HH:mm:ss (Ex : 10-Sep-2016 18:40:47)
public class FormatDate5 {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println("Today is : " + today);
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
		System.out.println("Today in dd-MMM-yyyy HH:mm:ss format : " + formatter.format(today));
	}
}
