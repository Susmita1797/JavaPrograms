package BasicPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseStringUsingCollections {

	public static void main(String[] args) {
		
		String str = "Susmita";
		
		ArrayList<Character> list = new ArrayList<>();
		
		for(char c:str.toCharArray()) {
			
			list.add(c);
		}
        
		System.out.println("Array of Character before reverse:" +list);
		
		Collections.reverse(list);
		
		System.out.println(list);
		
		StringBuilder sb = new StringBuilder(list.size());
		
		for(Character ch:list) {
			
			sb.append(ch);
		}
		
		System.out.println("After reverse:"+sb);
	}

}
