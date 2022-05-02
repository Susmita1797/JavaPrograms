package firstprogram;
//Java program to ReverseString using StringBuilder
import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		
			 {
			     String s = "my name is khan";

			     // convert String to character array by using toCharArray
			     char[] ch = s.toCharArray();

			     for (int i = ch.length - 1; i >= 0; i--)
			         System.out.print(ch[i]);
			 }
			}

	}

		/*Scanner sc = new Scanner(System.in);

		System.out.println("Enter a line of text: ");
		String text = sc.nextLine();

		StringBuilder text1 = new StringBuilder();

		text1.append(text);   // append a string into StringBuilder input1
		text1.reverse();      // reverse StringBuilder input1

		System.out.println(text1);

	}

}
 

//Java program to ReverseString using ByteArray.
import java.lang.*;
import java.io.*;
import java.util.*;
/*
//Class of ReverseString
class ReverseString {
	public static void main(String[] args)
	{
		String S = "Geeks for Geeks";

		StringBuilder sb = new StringBuilder(); //create object of StringBuilder class

		sb.append(S);  // append a string into StringBuilder input1
		
		sb.reverse();   //using reverse() method of StringBuilder class to reverse the string

		// print reversed String
		System.out.println(sb);
	}
}

*/
//Java program to Reverse a String  by converting string to characters  one by one 


/*
//Java program to ReverseString using ByteArray
import java.lang.*;
import java.io.*;
import java.util.*;

//Class of ReverseString
class ReverseString {
 public static void main(String[] args)
 {
     String input = "GeeksforGeeks";

     // getBytes() method to convert string into bytes[].
     byte[] strAsByteArray = input.getBytes();

     byte[] result = new byte[strAsByteArray.length];

     // Store result in reverse order into the result byte[]
     for (int i = 0; i < strAsByteArray.length; i++)
         result[i] = strAsByteArray[strAsByteArray.length - i - 1];

     System.out.println(new String(result));
 }
}

//Java program to Reverse a String using ListIterator
import java.lang.*;
import java.io.*;
import java.util.*;

//Class of ReverseString
class ReverseString {
 public static void main(String[] args)
 {
     String s = "Geeks For Geeks";
     char[] ch = input.toCharArray(); 
     List<Character> trial1 = new ArrayList<>(); //create ArrayList object 

     for (char c : hello)
         trial1.add(c); //copy String contents to an object of ArrayList

     Collections.reverse(trial1); // reverse method of collections class is used to reverse the list
     ListIterator li = trial1.listIterator();  //create a ListIterator object by using the listIterator() method on the ArrayList object
     while (li.hasNext())  // ListIterator object is used to iterate over the list
         System.out.print(li.next());  //ListIterator object helps us to iterate over the reversed list and print it one by one to the output screen
 }
}*/