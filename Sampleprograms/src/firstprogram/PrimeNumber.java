package firstprogram;

/*A number is prime if it is divisible by 1 and itself.
  In other words, a prime number is a natural number with exactly two distinct natural number divisors 1 and itself. For example, 2, 3, 5, 7, 11, etc. are the prime numbers. Note that 0 and 1 are not prime numbers.
  The number 2 is the only even prime number because all the other even numbers are divisible by 2package firstprogram;
 */

public class PrimeNumber{    
	
	 public static void main(String args[]){ 
		 
		 int i, n=7, temp=0;
		  
		   for(i=2;i<=n-1;i++){      
		    if(n%i==0){
		    	temp = temp+1;
		     //System.out.println(n+" is not prime number");      
		   }      
		   if(temp==0)  {
		    System.out.println(n+" is  prime number"); 
		   break;}
		   else {
			   System.out.println(n+" is prime number");  }  
		   }
		  }//end of else  
}
	
	/* public static void main(String args[]){ 
		 
	  int i,temp=0;      
	  int n=7;//it is the number to be checked    
	  
	  if(n==0||n==1){  
	   System.out.println(n+" is not prime number");      
	  }
	  else{  
	   for(i=2;i<=n-1;i++){      
	    if(n%i==0){
	    	temp = temp+1;
	     //System.out.println(n+" is not prime number");      
	   }      
	   if(temp==0)  {
	    System.out.println(n+" is  prime number"); 
	   break;}
	   else {
		   System.out.println(n+" is prime number");  }  
	   }
	  }//end of else  
	}    
	}   

	public static void main(String[] args) {
        //range
        int min = 2;
        int max = 100;
        //find all prime numbers in the given range
        for(int n=min;n<=max;n++) {
            //check if this number is prime
            if(isPrime(n)) {
                System.out.println(n);
            }
        }
    }
     
    public static boolean isPrime(int num) {    
        for(int i = 2; i <= num/i; ++i) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}*/