package firstprogram;

import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args) {

		String Str1, Str2;
		Scanner sc = new Scanner(System.in);


		System.out.println("Enter the 1st string");
		Str1=sc.nextLine();

		System.out.println("Enter the 2nd string");
		Str2=sc.nextLine();

		System.out.println("Concatenated String is " +Str1.concat(Str2));
		//System.out.println(Str1 + Str2);


	}

}

/*
 
  */
