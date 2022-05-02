package firstprogram;

import java.util.Scanner;

public class Stringcomparison {

	public static void main(String args[]) {

		String Str1, Str2, Str3;
		Scanner sc = new Scanner(System.in);


		System.out.println("Enter the 1st string");
		Str1=sc.nextLine();

		System.out.println("Enter the 2nd string");
		Str2=sc.nextLine();


		System.out.println("Enter the 3rd string");
		Str3=sc.nextLine();

		//String Comparison using Relational Operator (==)
		System.out.println(Str1 == Str2);//false
		System.out.println(Str1 == Str3);//true

		//String Comparison using equals() method
		System.out.println(Str1.equalsIgnoreCase(Str2));//false
		System.out.println(Str1.compareTo(Str2));
		System.out.println(Str1.equals(Str3));//true

	}
}
