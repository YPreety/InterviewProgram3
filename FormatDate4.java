package GeneralProgramming;

import java.text.SimpleDateFormat;
import java.util.Date;

//Pattern 4 : E, dd MMM yyyy (Ex : Sat, 10 Sep 2016)
public class FormatDate4 {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println("Today is : " + today);
		SimpleDateFormat formatter = new SimpleDateFormat("E, dd MMM yyyy");
		System.out.println("Today in E, dd MMM yyyy format : " + formatter.format(today));
	}
}
