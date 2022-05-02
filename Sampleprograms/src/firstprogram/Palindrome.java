//Palindrome phrase number or a sequence will be the same even if it was written backwards ex: madam,eye,malayalam,amma
package firstprogram;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		String original, reverse = ""; // Objects of String class  

		System.out.println("Enter a string/number to check if it is a palindrome: ");  

		Scanner sc = new Scanner(System.in);
		original = sc.next();

		int length = original.length();

		for ( int i = length - 1; i >= 0; i-- )  
			reverse = reverse + original.charAt(i);  

		if (original.equals(reverse))  
			System.out.println("Entered string/number is a palindrome.");  
		else  
			System.out.println("Entered string/number isn't a palindrome.");   
		/*String S1 = "MoM", S2="";
		
		int length = S1.length();
		
		for(int i = length -1 ; i>=0; i--) {
			S2 = S2 + S1.charAt(i);
			
			if(S1.equals(S2)) 
				System.out.println("Entered string/number is a palindrome.");  
			else  
				System.out.println("Entered string/number isn't a palindrome."); */
		
			
		}
		
		

	}
