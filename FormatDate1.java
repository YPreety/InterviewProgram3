package GeneralProgramming;

import java.text.SimpleDateFormat;
import java.util.Date;

//Pattern 1 : dd/MM/yyyy (Ex : 10/09/2016)
public class FormatDate1 {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println("Today is : " + today);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Today in dd/MM/yyyy format : " + formatter.format(today));
	}
}
