//fibaonacci series has numbers in which each number is the sum of the two preceeding numbers
package firstprogram;

import java.util.Scanner;

public class Fibonacci{
	
	public static void main(String args[]) {
		
	int n1=0,n2=1,n3,i,count=10;//int n1=10,n2=11,n3,i,count=10;
		System.out.print(n1+" "+n2);//printing 0 and 1    
		for(i=2;i<count;i++)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
		
/*
		  Scanner sc = new Scanner(System.in); //scanner object to obtain data
          System.out.println("How many fibonacci series numbers: ");
          int num = sc.nextInt();
          displayfibonacciseries(num); //method call
          sc.close();
          
          }
		static void displayfibonacciseries(int n)
		{
			int n1=0,n2=1,n3=0,count=1;
			while(count<=n)
			{
				System.out.println(n3+" ");
				  n1=n2;    
				  n2=n3;    
				
			}
		
		/* To print for a range of 10-50
		 for(i=10;i<=50;i++) {  //loop starts from 2 because 0 and 1 are already printed    
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;    
			n2=n3;    
		}*/
	}

}