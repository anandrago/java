package defaultpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class $1_18_1MapHashMap_Remove {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("100", "Google");
		map.put("101", "Amazon");
		map.put("102", "Apple");
		map.put("103", "Microsoft");
		
	/*	Set<String> keys= map.keySet();
		
		System.out.println("Before Key deletion");
		for(String key:keys)
			System.out.println(key+" "+map.get(key));
		
		map.remove("102");
		System.out.println();
		System.out.println("After Key deletion");
		for(String key:keys)
			System.out.println(key+" "+map.get(key));
		
		*/
		System.out.println("Before deletions");
	for	(Entry<String,String> entry: map.entrySet()) {
		System.out.println(entry.getKey()+" "+entry.getValue());
	}

	map.remove("100");
	
	System.out.println();
	System.out.println("After deletion");
	 for(Entry<String,String> entry: map.entrySet()) {
		 System.out.println(entry.getKey()+" "+ entry.getValue());
	 }
	}

}
