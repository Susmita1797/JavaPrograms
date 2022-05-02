package BasicPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class OccurancesOfEachCharInString {

	public static void main(String[] args) {

		String str = "aabbccddeeff";

		ArrayList<Character> list = new ArrayList<>();

		for(char c:str.toCharArray()) {

			list.add(c);
		}

		System.out.println(list);

		HashMap<Character,Integer> map = new HashMap<>();

		for(char ch:list) {
			
			if(map.containsKey(ch)) {

                   int count = map.get(ch);
                   map.put(ch, count+1);
			}
			
			else {
				
				map.put(ch, 1);
			}
		}
		
		Set<Entry<Character, Integer>>  entrymap =map.entrySet();
		
		for(Entry<Character, Integer> entry : entrymap) {
			
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

}
