package defaultpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class $1_19ListIterator {

	public static void main(String[] args) {
		String[] things = {"Bat","Ball","Glove","Stumps"};
		List<String> list1 = new ArrayList<>();
		for(String s:things)
			list1.add(s);
		System.out.print("List 1 = ");
		for(String s:list1)
			System.out.printf("%s ",s);
		System.out.println();
		
		String[] morethings = {"Ball","Glove"};
		List<String> list2 = new ArrayList<>();
		for(String s:morethings)
			list2.add(s);
		System.out.print("List 2 = ");
		for(String s:list2)
			System.out.printf("%s ",s);
		
		System.out.println();
		
		String[] somemorethings = {"Racket","Helmet","Shoes","Jersey"};
		List<String> list3 = new ArrayList<>();
		for(String s:somemorethings)
			list3.add(s);
		System.out.print("List 3 = ");
		for(String s:list3)
			System.out.printf("%s ",s);
		System.out.println();
		
		list1.addAll(list3);
		list3=null;
		System.out.print("List 1&3 added, List1  = ");
		for(String s:list1)
			System.out.printf("%s ",s);
		
		editlist(list1,list2);
		System.out.println();
		
		Collections.reverse(list1);
		System.out.print("List 1 after removing List 2 common things = ");
		for(String s:list1)
			System.out.printf("%s ",s);
		
	}
	public static void editlist(Collection<String> l1,Collection<String> l2) {
		Iterator<String> it = l1.iterator();
		while(it.hasNext())
		{
			if(l2.contains(it.next())) {
				it.remove();
			}
		}
	}

}
