package BasicPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class DuplicateElementsInArrayAsLlistUsingCollections {

	public static void main(String[] args) {

		//int a[] = {5,4,2,8,9,1,3,5,1,4,8,9,3};
		//String a[] = {"ss","sv","su","ss","sv"};
		
		String str = "Programming";

		ArrayList<Character> list = new ArrayList<>();

		for(char s:str.toCharArray()) {

			list.add(s);

		}

		System.out.println("ArrayList before removing the duplicates: "+list);

		for(int i=0;i<=list.size()-1;i++) {

			for(int j=i+1;j<=list.size()-1;j++) {

				if(list.get(i).equals(list.get(j))) {

					list.remove(i);
				}

			}
		}

		System.out.println("ArrayList before removing the duplicates: "+list);

	}

}
