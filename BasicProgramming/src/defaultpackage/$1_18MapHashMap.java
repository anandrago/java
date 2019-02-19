package defaultpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class $1_18MapHashMap {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("Name", "Anand");
		map.put("StuId","525");
		map.put("location","California");
		map.put("StuId", "500");
		map.put("Professor", "Anand");
		
		Set<String> keys = map.keySet();
		
		for(String key:keys) {
			System.out.println(key +" "+ map.get(key));
		}
	}
}
