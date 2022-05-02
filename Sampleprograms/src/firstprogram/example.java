package firstprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Hello {
	public static void main(String[] args) throws IOException {



		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println("Enter the string");
		String str = sc.nextLine();

		System.out.printf("You have entered:- " + num +
				" and name as " + str);



			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number");
		int a = Integer.parseInt(br.readLine());

		System.out.println("Enter the string");
		String b = br.readLine();

		System.out.printf("You have entered:- " + a +
                " and name as " + b);
                *
		
	
		        // Using Console to input data from user
		        String name = System.console().readLine();
		 
		       
		        System.out.println("You entered string " + name);
		
		 */
		
		// check if length of args array is
        // greater than 0
        if (args.length > 0) {
            System.out.println(
                "The command line arguments are:");
 
            // iterating the args array and printing
            // the command line arguments
            for (String val : args)
                System.out.println(val);
        }
        else
            System.out.println("No command line "
                               + "arguments found.");
	}

}
