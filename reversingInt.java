import java.util.*;

/*
* This is a simple method to reverse the "num" int value
* plus any negative sign if "num" has them.
*/
public class reversingInt
{

	/*
	This method handles the reverse in the int value.
	*/
	public static int reverseInt(int num){
		// changes the num into absolute value
		// for removing any negative signs for string and char
		int absNum = Math.abs(num);

		// Integer.toString converts the absNum into a string
		// and reverseInt is used to store the reversed int value as a string
		String numToStr = Integer.toString(absNum);
		String reverseInt = "";

		// for every character c in the numToStr which has been 
		// converted to a char array, we add it to reverseInt
		// before any strings stored in the reverseInt
		for (char c : numToStr.toCharArray())
		{
			reverseInt = c + reverseInt;
		}

		// returns the value to the reversedInt,
		// but copy the sign from the "num" if it had any negative sign
		// change the reverseInt from string to a float, then
		// cast as an int before returning
		return (int) Math.copySign(Integer.parseInt(reverseInt), num);
	}

	public static void main(String args[])
	{
		int num = -12345;
		System.out.println(reverseInt(num));
	}

}