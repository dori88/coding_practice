/*
* Famous FizzBuzz function.
* This function prints out the number given to the function
* However if the number is multiple of 3 it prints Fizz,
* if it is multiple of 5 it prints Buzz,
* and if it is multiple of 3 and 5, it prints FizzBuzz.
*/

public class fizzBuzz
{
	// Function to print the numbers given to the function.
	// Multiple of 3 prints Fizz, multiple of 5 prints BUzz,
	// and multiple of 3 and 5 prints FizzBuzz.
	public static void fizzBuzz(int num)
	{
		for (int i = 1; i <= num; i++)
		{
			// First checks if the number is
			// multiple of 3 and 5 to print FizzBuzz
			if (i % 5 == 0 && i % 3 == 0)
			{
				System.out.println("FizzBuzz");
			}
			// Then checks if the number is multiple of 3
			else if (i % 3 == 0)
			{
				System.out.println("Fizz");
			}
			// and lastly checks if the number is multiple of 5
			else if (i % 5 == 0)
			{
				System.out.println("Buzz");
			}
			// Otherwise, if the number is not multiple of 3, 5, or 3/5,
			// prints the regular number.
			else
			{
				System.out.println(i);
			}
		}
	}
	
	public static void main(String args[])
	{	
		int num = 30;
		fizzBuzz(num);
	}
}