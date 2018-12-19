/*
Very simple function to easily reverse any given string
using a function. By converting the string to a char array,
and adding each character before the previous character,
the result shows the string in complete reverse order.
*/
public class reversingString
{

	public static String reverseString(String str)
	{
		// empty String to hold the reversed String
		String reverse = "";

		// for loop that runs through the str as a char array
		// and adds each character before the existing reversed string "reverse"
		for (char c : str.toCharArray())
		{
			reverse = c + reverse;
		}

		// returns the String back to main
		return reverse;
	}

	public static void main(String args[])
	{
		String str = "Hello World!";
		System.out.println(reverseString(str));
	}
}