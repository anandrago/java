package defaultpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class $1_21CollectionsFrequencyDisjoint {
	public static void main(String[] args) {
		String[] products = {"Iphone","Iwatch","Mac","Ipod","Ipad"};
		List<String> obj1 = new ArrayList<>(Arrays.asList(products));
		
		List<String> obj2 = new ArrayList<>();
		obj2.add("Android");
		obj2.add("Windows");
		obj2.add("Google");
		
		Collections.addAll(obj2, products);
		for(String s:obj2)
			System.out.printf("%s ",s);
		
		System.out.println();
		System.out.println(Collections.frequency(obj2, "Ipad")); //prints 1
		
		
		Boolean tof = Collections.disjoint(obj1, obj2);
		System.out.println(tof); //Prints False because there are common elements present
		if(tof)
			System.out.println("Nothing common exists");
		else
			System.out.println("There is common elements"); //Prints this because it is false
		
	}
}
