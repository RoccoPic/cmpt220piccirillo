import java.util.GregorianCalendar;
public class P9_5 {
public static void main(String []args) {
	GregorianCalendar calendar = new GregorianCalendar();
	
	System.out.print("The current month, day, and year is ");
	int month = calendar.get(calendar.MONTH);
	int day = calendar.get(calendar.DAY_OF_MONTH);
	int year = calendar.get(calendar.YEAR);
	System.out.print((month + 1) + "/" + day + "/" + year);
	
	calendar.setTimeInMillis(1234567898765L);
	month = calendar.get(calendar.MONTH);
	day = calendar.get(calendar.DAY_OF_MONTH);
	year = calendar.get(calendar.YEAR);
	System.out.println("\nThe time elapsed since January 1, 1970 is " + (month + 1)+ "/" + day + "/" + year);
}
}
