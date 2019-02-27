package datenumbercurrency;
import java.util.*;
import java.text.*;
import java.time.LocalDate;
public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Date d=new Date();
		SimpleDateFormat formatter=new SimpleDateFormat("MM/dd/yyyy hh-mm-ss-SSS a z D");
		String s1=formatter.format(d);
		System.out.println("formatted date "+s1);
		System.out.println("enter year");
		int year=sc.nextInt();
		System.out.println("enter month");
		int month=sc.nextInt();
		System.out.println("enter day");
		int day=sc.nextInt();
		 LocalDate dt = LocalDate.of(year, month, day);
	        String st=dt.getDayOfWeek().toString();
	        System.out.println("day of week is "+st);
	}

}
