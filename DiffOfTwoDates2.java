package GeneralProgramming;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//Find Difference Between Two Dates In Java Using TimeUnit

public class DiffOfTwoDates2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start date in dd-MM-yyyy/HH:mm:ss format :");
		String s1 = sc.next();
		System.out.println("Enter end date in dd-MM-yyyy/HH:mm:ss format :");
		String s2 = sc.next();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy/HH:mm:ss");

		try {
			Date startDate = formatter.parse(s1);
			Date endDate = formatter.parse(s2);
			long diffInMilliSec = endDate.getTime() - startDate.getTime();
			long seconds = TimeUnit.MILLISECONDS.toSeconds(diffInMilliSec) % 60;
			long minutes = TimeUnit.MILLISECONDS.toMinutes(diffInMilliSec) % 60;
			long hours = TimeUnit.MILLISECONDS.toHours(diffInMilliSec) % 24;
			long days = TimeUnit.MILLISECONDS.toDays(diffInMilliSec) % 365;
			long years = TimeUnit.MILLISECONDS.toDays(diffInMilliSec) / 365l;
			System.out.println("Difference is ---> ");
			System.out.println(years + " years, " + days + " days, " + hours + " hours, " + minutes + " minutes, "
					+ seconds + " seconds");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
