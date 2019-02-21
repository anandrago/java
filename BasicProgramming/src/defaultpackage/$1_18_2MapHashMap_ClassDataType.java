package defaultpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class $1_18_2MapHashMap_ClassDataType {

	public static void main(String[] args) {
		Map<Integer,$1_18_3Customer> map = new HashMap<>();
		map.put(1, new $1_18_3Customer("John",25,5000,"Los Angeles"));
		map.put(2, new $1_18_3Customer("David",34,8000,"San Jose"));
		map.put(3, new $1_18_3Customer("Stephen",28,7000,"San Diego"));
		map.put(4, new $1_18_3Customer("George",38,10000,"San Francisco"));
		map.put(4, new $1_18_3Customer("Mark",32,9000,"San Francisco"));
		
		for(Entry<Integer,$1_18_3Customer> entry:map.entrySet()) {
			$1_18_3Customer c = entry.getValue();
			System.out.println(entry.getKey()+" "+c.name+" "+c.age+" "+c.salary+" "+c.place );
		}
	}

}
