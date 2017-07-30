import java.util.regex.Pattern;

/**
 * 
 * [a-zA-Z] : Means any character that IS a-z OR A-Z
 *
 */
public class RegexDemo1
{
	public static void main(String[] args)
	{
		System.out.println("[a-zA-Z] matches A = " +   Pattern.matches("[a-zA-Z]", "A"));
		System.out.println("[a-zA-Z] matches d = " +   Pattern.matches("[a-zA-Z]", "d"));
		System.out.println("[a-zA-Z] matches ddZY = " +   Pattern.matches("[a-zA-Z]", "ddZY"));
		System.out.println("[a-zA-Z] matches 1 = " +   Pattern.matches("[a-zA-Z]", "1"));
	}

}