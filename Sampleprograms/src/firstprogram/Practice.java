package firstprogram;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

class Practice
{
	public static void main(String args[])
	{
		String str = "Programming";

		StringBuilder sb = new StringBuilder();  //stringBuilder object to store the characters
		Set<Character> set = new LinkedHashSet(); //set object since it wont allow duplicates

		for(int i=0; i<str.length();i++)  
		{
			set.add(str.charAt(i));
		}
		for(Character c :set)
		{
			sb.append(c);
		}
		System.out.println(set);
	}}





