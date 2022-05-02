package firstprogram;

//(LCM) of two or more numbers is the least positive number that can be divided by both the numbers,
//without leaving the remainder
public class LCM {

	public static void main(String[] args) {

		//Using if Statement
		int a = 12, b = 9, gcd = 1;  
		//finds GCD  
		for(int i = 1; i <= a && i <= b; ++i)   
		{  
			//divides both the numbers by i, if the remainder is 0 the number is completely divisible by i  
			//Checks that i is present in both or not  
			//returns true if both conditions are true  
			if(a % i == 0 && b % i == 0)  
				//assigns i into gcd  
				gcd = i;  
		}  
		//determines lcm of the given number  
		int lcm = (a * b) / gcd;  
		//prints the result  
		//System.out.printf("The LCM of %d and %d is %d.", a, b, lcm);  
		
		System.out.printf("The LCM  is " +lcm);  
	
	}

}

/*Using Recursion
int x, y;      
Scanner sc = new Scanner(System.in);    
System.out.print("Enter the first number: ");    
x = sc.nextInt();    
System.out.print("Enter the second number: ");   
y = sc.nextInt();    
System.out.println("LCM of " + x +" and " + y +" is " + findLcm(x, y));  
}  
//function that finds GCD of the number  
static int findGcd(int x, int y)  
{  
if (x == 0)  
//returns y is x==0  
return y;  
//calling function that returns GCD  
return findGcd(y % x, x);  
}  
//function finds the LCM  
static int findLcm(int x, int y)  
{  
//returns the LCM      
return (x / findGcd(x, y)) * y;  */