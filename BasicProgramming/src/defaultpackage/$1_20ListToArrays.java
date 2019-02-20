package defaultpackage;

import java.util.Arrays;
import java.util.LinkedList;

public class $1_20ListToArrays {
 public static void main(String[] args) {
	 String[] s = {"Water","Juice","Milk","Coke"};
	 LinkedList<String> al = new LinkedList<>(Arrays.asList(s));
	 for(String x: al)
		 System.out.printf("%s ",x);
	 al.add("Fanta");
	 al.addFirst("Beer");
	
	 System.out.println();
	 s = al.toArray(new String[al.size()]);
	 for(String x:s)
	 System.out.printf("%s ",x);
 }
}
