package firstprogram;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

          Scanner sc = new Scanner(System.in); //scanner object to obtain data //constructor of the Scanner class  
          
          System.out.println("enter first no: ");
          int no1 = sc.nextInt();  //reading an integer from the user  
          
          System.out.println("enter second no: ");
          int no2 = sc.nextInt(); //reading an integer from the user  
          
          System.out.println("enter operator[+,-,*,/]: ");
          char operator = sc.next().charAt(0); //reading an character from the user  

          
          if (operator=='+' || operator=='-' || operator=='*' || operator=='/' )
          {
          int result = calculate(no1,no2,operator);
          System.out.println(no1+" "+operator+" "+no2+" = "+result);
          }
          else
          {
        	  System.out.println("Invalid operator");
        	  }
           sc.close();
	}
     //method to perform operation
	static int calculate(int x,int y, char operator) {
		
		int result=0;
		switch(operator)
		{
		case '+':
			result=x+y;
			break;
		case '-':
			result=x-y;
			break;
		case '*':
			result=x*y;
			break;
		case '/':
			result=x/y;
				
		} //Switch close
		return result;
		
	}//close of Method calculate
}//close of class
