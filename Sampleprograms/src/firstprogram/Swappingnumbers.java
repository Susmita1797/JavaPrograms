package firstprogram;

public class Swappingnumbers {

	//Approach 1: Swapping the Values Using Third Variable
	// Function to swap two numbers Using temporary variable
	static void swapValuesUsingThirdVariable(int m, int n)
	{
		// Swapping the values
		int temp = m;
		m = n;
		n = temp;
		System.out.println("Value of m is " + m
				+ " and Value of n is " + n);
	}

	// Main driver code
	public static void main(String[] args)
	{
		int m = 9, n = 5;  // Random integer values

		swapValuesUsingThirdVariable(m, n);   // Calling above function to reverse the numbers

	}

}

/*
Approach 2: Swapping the Values Without Using Third Variable by using sum and differences concepts of maths.
static void swapValuesWithoutUsingThirdVariable(int m,
int n)
{
// Steps as listed in algorithm

a = a + b;
b = a - b;
a = a - b;

// Print numbers
System.out.println("Value of m is " + m
+ " and Value of n is " + n);
}

//  Main driver method
public static void main(String[] args)
{
// Random numbers of integer type
int m = 9, n = 5;

// Above function is called in main
// to print swapped values of numbers
 
swapValuesWithoutUsingThirdVariable(m, n);

//Approach 3: Swapping the Values Using Operator

static void swapValuesUsingXOROperator(int m, int n)
{
    // Logic of XOR operator
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;

    System.out.println("Value of m is " + m
                       + " and Value of n is " + n);
}

// Main driver method
public static void main(String[] args)
{
    // Random two integer numbers
    // to get swapped
    int m = 9, n = 5;

    // Calling the function in main method
    // to get above integer numbers swapped
    swapValuesUsingXOROperator(m, n);


//*/



/*
 * a= a*b;
 * b= a/b;
 * a= a/b;
 *
 *
 *
 */
