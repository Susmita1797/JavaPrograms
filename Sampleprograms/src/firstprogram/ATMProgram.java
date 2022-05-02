package firstprogram;

import java.util.Scanner;

public class ATMProgram {

	public static void main(String[] args) {   //NumberToWord

		int balance=1000,deposit,withdraw;    //declare and initialize balance, withdraw, and deposit  

		Scanner sc = new Scanner(System.in);   // //create scanner class object to get choice of user  
		while(true)  
		{  
			System.out.println("Automated Teller Machine");  
			System.out.println("Choose 2 for Deposit");  
			System.out.println("Choose 3 for Check Balance");  
			System.out.println("Choose 4 for EXIT");  
			System.out.print("Choose the operation you want to perform:");  


			int choice = sc.nextInt();   //get choice from user  
			switch(choice)  
			{  
			case 1:  
				System.out.print("Enter money to be withdrawn:");   
				withdraw = sc.nextInt();    //get the withdrawl money from user  

				if(balance >= withdraw)  
				{  

					balance = balance - withdraw;  //remove the withdrawl amount from the total balance  
					System.out.println("Please collect your money: "+balance);  
				}  
				else  
				{  
					System.out.println("Insufficient Balance");  //show custom error message   
				}
				break;  

			case 2:  

				System.out.print("Enter money to be deposited:");  

				deposit = sc.nextInt();  //get deposite amount from te user

				balance = balance + deposit;  	//add the deposit amount to the total balanace  
				System.out.println("Your Money has been successfully depsited");  
				System.out.println("");  
				break;  

			case 3:  

				System.out.println("Balance : "+balance);  //displaying the total balance of the user  
				System.out.println("");  
				break;  

			case 4:  

				System.exit(0);  //exit from the menu  
			}  
		}  
	}  
}  

