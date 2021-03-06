import java.time.Month;
import java.time.temporal.ChronoField;

public class MonthDemo1
{
	public static void main(String[] args)
	{
		Month month = Month.NOVEMBER;
		
		/*
		 * Parameters:
		 * 
		 * field - the field to get, not null
		 * 
		 * Returns:
		 * 
		 * the value for the field, within the valid range of values
		 */
		int monthOfYear = month.get(ChronoField.MONTH_OF_YEAR);
		System.out.println("monthOfYear = "+monthOfYear);
	}

}
