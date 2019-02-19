package defaultpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class $1_16Comparator {

	public static void main(String[] args) {
		List<Integer> values= new ArrayList<>();
		 values.add(402);
		 values.add(805);
		 values.add(907);
		 values.add(2009);
		 
		 /*Comparator<Integer> c = new Comparator<Integer>() {
			 public int compare(Integer i,Integer j) {
				 if(i%10>j%10)
					return 1;
				 else
					 return -1;
				
			 }
		 };*/
		 
		/* Comparator<Integer> c = (Integer i,Integer j) ->{
				 if(i%10>j%10)
					return 1;
				 else
					 return -1;
				
			 }
		 ;*/
		/* Comparator<Integer> c = (i,j) ->{
			 return i%10>j%10?1:-1;
		 };*/
		 
		// Comparator<Integer> c = (i,j) -> i%10>j%10?1:-1;
		 
		 
		 
		 Collections.sort(values, (i,j) -> i%10>j%10?1:-1);
		// Collections.reverse(values);
		// Collections.shuffle(values);
		 for(Integer i:values) {
			 System.out.println(i);
		 }

	}

}
