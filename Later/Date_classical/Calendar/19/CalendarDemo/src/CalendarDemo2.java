import java.util.Calendar;

public class CalendarDemo2
{
	public static void main(String[] args)
	{
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();

		System.out.println("Current date = " + cal1.getTime());

		cal2.set(Calendar.YEAR, 2030);
		System.out.println("future date  = " + cal2.getTime());

		/*
		 * Parameters:
		 * 
		 * obj - the object to compare with.
		 * 
		 * Returns:
		 * 
		 * true if this object is equal to obj; false otherwise.
		 */

		int result = cal1.compareTo(cal2);
		System.out.println("result = " + result);
	}

}
