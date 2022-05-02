package firstprogram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);   //scanner object to obtain data
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		
		Factorial fobj = new Factorial();
		int fact = fobj.factorial(num);
			System.out.println("Factorial of "+num+" = "+ fact); 
	}
	
	//Iterative Solution:
	
	/*int factorial(int n) {
		int fact=1;
		for(int i=2;i<=n;i++) {
			fact=fact*i;
		}
		return fact;*/
	
	//One line Solution (Using Ternary operator):
		
		int factorial(int n)
		  {
		  
		    // single line to find factorial
		    return (n == 1 || n == 0) ? 1 : n*factorial(n - 1);
		  
		  }
	}

