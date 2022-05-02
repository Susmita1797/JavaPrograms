package BasicPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInArrayAsLlistUsingSet {

	public static void main(String[] args) {
		
		//int a[] = {5,4,2,8,9,1,3,5,1,4,8,9,3};
		  String a[] = {"ss","sv","su","ss","sv"};
		  boolean flag = false;
		  
		  Set<String> set=new HashSet<>();
		  
		  for(String s:a) {
			  
			  if(set.add(s)==false) {
				  
				  flag=true;
			  }
		  }
		  
		  if(flag==false) {
			  
			  System.out.println("No duplicate elements present in the Array");
		  }
		  
		  else {
			  
			  System.out.println(set);
		  }

	}

}
