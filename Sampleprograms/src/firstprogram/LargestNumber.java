package firstprogram;

public class LargestNumber {
	// Function to find the biggest of three numbers
	static int biggestOfThree(int x, int y, int z)
	{

		if (x >= y && x >= z)    // Comparing all 3 numbers

			return x;  // Returning 1st number if largest

		else if (y >= x && y >= z)   // Comparing 2nd no with 1st and 3rd no

			return y; // Return z if the above conditions are false

		else

			return z;  // Returning 3rd no, Its sure it is greatest
	}

	// Main driver function
	public static void main(String[] args)
	{
		int a, b, c, largest;

		// Considering random integers three numbers
		a = 5;
		b = 10;
		c = 3;
		
		largest = biggestOfThree(a, b, c);// Calling the function in main() body

		System.out.println(largest+ " is the largest number.");	// Printing the largest number
	}
}
