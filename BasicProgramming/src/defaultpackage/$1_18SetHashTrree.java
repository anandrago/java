package defaultpackage;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class $1_18SetHashTrree {

	public static void main(String[] args) {
		Set<Integer> values = new TreeSet();
		System.out.println(values.add(87));
		values.add(67);
		values.add(45);
		System.out.println(values.add(89));
		
		for(int i:values) {
			System.out.println(i);
		}

	}

}
