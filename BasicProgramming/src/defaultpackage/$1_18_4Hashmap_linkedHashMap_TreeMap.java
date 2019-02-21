package defaultpackage;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class $1_18_4Hashmap_linkedHashMap_TreeMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> map = new LinkedHashMap<>(); //Insertion order is maintained
	  //TreeMap<Integer,String> map = new TreeMap<>(); //Maintains the data in the ascending order
		map.put(1030, "Washington");
		map.put(100,"California");
		map.put(101, "Arizona");
		map.put(10200, "Oregon");
		
		//System.out.println(map);
		
		for(Entry<Integer,String> entry:map.entrySet())
		System.out.println(entry.getKey()+" "+entry.getValue());
	}

}
