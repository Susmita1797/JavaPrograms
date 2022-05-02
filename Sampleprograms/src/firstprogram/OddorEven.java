package firstprogram;

public class OddorEven {
	static  int num = 10;
	 // Main Driver Method
	public static void main(String[] args) {

		// Declare the integer variable
       
  
        // If condition to check if the remainder is zero
        if (num % 2 == 0) {
            // If remainder is zero then this number is even
           // System.out.println("Entered Number is Even");
        	
        	OddorEven obj = new OddorEven();
        	System.out.println(obj.num);
        }
        else {
            // If remainder is not zero then this number is odd
            System.out.println("Entered Number is Odd");
        }

	}

}

//Approach 2:  use Bitwise Operators

//Using Bitwise OR:


	
