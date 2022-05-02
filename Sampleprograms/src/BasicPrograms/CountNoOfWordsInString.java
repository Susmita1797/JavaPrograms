package BasicPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class CountNoOfWordsInString {

	public static void main(String[] args) {

		String str = "This this is is done by Saket Saket";
		String[] s = str.split(" ");

		HashMap<String,Integer> map = new HashMap<>();
		int count =1;

		for(int i=0;i<s.length-1;i++) {

			if(map.containsKey(s[i])) {

				map.put(s[i], count++);
			}

			else {

				map.put(s[i], count);
			}

		}

		Set<Entry<String,Integer>> entrymap = map.entrySet();

		//Iterating using advanced for loop
//		for(Entry<String,Integer> entry:entrymap) {
//
//			System.out.println(entry.getKey()+":"+entry.getValue());
//		}
		
		//Iterating Using while loop:
		
		 Iterator<Entry<String, Integer>> itr = map.entrySet().iterator();
		 
		 while(itr.hasNext()) {
			 
			 Entry<String, Integer> entry = itr.next();
			 
			 System.out.println("Key is " + entry.getKey() + " Value is " + entry.getValue());
		 }

	}

}
