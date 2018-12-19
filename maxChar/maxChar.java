/*
* This function reads in the string
* and finds the character with most count in the function.
* This is done by making an empty array of int and
* whichever character is stored in charAt(i) inside the for loop,
* the array will increment that character by 1,
* and later find whichever character had the most count before returning
* and ending the function.
*/
public class maxChar
{

	public static char maxChar(String str)
	{
		// making an empty array of int to
		// store the count of the number.
		int[] num = new int[256];

		// For loop will loop through the entire string
		// and increment the position at num[] using the char used
		// at str.charAt(i)
		for (int i = 0; i < str.length(); i++)
		{
			num[str.charAt(i)]++;
		}

		// max is initialized at -1 as a placeholder
		int max = -1;
		// result is initialized to store the char value later
		char result = ' ';

		// for loop to see which char within int[] value
		// has the highest count to return
		for (int i = 0; i < str.length(); i++)
		{
			// whenever max is lower than the num[str.charAt(i)], 
			// it will enter this if statement
			if(max < num[str.charAt(i)])
			{
				// max will change the count at current num[str.charAt(i)]
				max = num[str.charAt(i)];
				// result store the character at str.charAt(i)
				result = str.charAt(i);
			}
		}

		return result;
	}

	public static void main(String args[])
	{
		String str = "11123332222255511233333311662222222222";
		System.out.println("For String with " + str +
		 	 "\nThe num with most count is " + maxChar(str));
	}

}