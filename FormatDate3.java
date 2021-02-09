package GeneralProgramming;

import java.text.SimpleDateFormat;
import java.util.Date;

//Pattern 3 : dd MMMM yyyy (Ex : 10 September 2016)
public class FormatDate3 {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println("Today is : " + today);
		SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");
		System.out.println("Today in dd MMMM yyyy format : " + formatter.format(today));
	}
}
