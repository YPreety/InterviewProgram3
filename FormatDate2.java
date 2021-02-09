package GeneralProgramming;

import java.text.SimpleDateFormat;
import java.util.Date;

//Pattern 2 : yyyy-MM-dd (Ex : 2016-09-10)
public class FormatDate2 {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println("Today is : " + today);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Today in yyyy-MM-dd format : " + formatter.format(today));
	}
}
