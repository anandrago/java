package defaultpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class $1_15Collections {
 public static void main(String[] args) {
	 /*Collection values = new ArrayList(); 
	 values.add(4);
	 values.add(8);
	 values.add(9);
	 Iterator it = values.iterator();
	while(it.hasNext()) {
	 System.out.println(it.next());
	 }
	 for(int i=0;i<values.size();i++) {
		 System.out.println(it.next());
	 }
	 for(Object i:values) {
		 System.out.println(it.next());
	 }*/
	 
	/* List values  = new ArrayList();
	 values.add(4);
	 values.add(8);
	 values.add(9);
	 values.add("Hello");
	// for(int i=0;i<values.size();i++) {
	 //System.out.println(values.get(i));}
	 for(Object o:values) {
		 System.out.println(o);
	 }*/
	 
	// List<Integer> values  = new ArrayList<Integer>();
	/* List<Integer> values  = new ArrayList<>();
	 values.add(4);
	 values.add(8);
	 values.add(9);
	 for(Integer i:values) {
		 System.out.println(i);
	 }*/
	 
	 List<Integer> values= new ArrayList<>();
	 values.add(402);
	 values.add(805);
	 values.add(901);
	 values.add(2001);
	 
	 Collections.sort(values);
	// Collections.reverse(values);
	// Collections.shuffle(values);
	 for(Integer i:values) {
		 System.out.println(i);
	 }
 }
}
