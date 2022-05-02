package BasicPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class NoOfCharInStringUsingHashMap {

	public static void main(String[] args) {
		
		String str = "Susmita";
		
		ArrayList<Character> list = new ArrayList<>();
		
		for(char c:str.toCharArray()) {
			
			list.add(c);
			
		}
		
		System.out.println(list);
		
		HashMap<String,Integer> map = new HashMap<>();
		int count =0;
		String s = "TotalCount" ;
		
		for(int i=0;i<=list.size();i++) {
			
			map.put(s, count++);
			
		}
		
		Set<Entry<String,Integer>> entrymap = map.entrySet();
		
		for(Entry<String,Integer> entry:entrymap) {
			
			System.out.println(entry.getKey()+":"+entry.getValue());
		}

	}

}
