/*
* A simple function to check whether the given string
* is a palindrome or not. When the function takes string as an argument
* it creates a reverse string and returns a boolean of the comparison.
*/

public class palindrome
{
	public static boolean checkPalindrom(String str)
	{
		// Making an empty string to store reversed string
		String rev = "";

		// For look that reverses the string by converting string
		// into a char array.
		for (char c : str.toCharArray())
		{
			rev = c + rev;
		}

		// returns the results of the comparison.
		return rev.equals(str);
	}

	public static void main(String args[])
	{
		String str = "abba";
		System.out.println("Is str a palindrome? " + checkPalindrom(str));
	}
}