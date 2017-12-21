package com.pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;



public class ListDemo3 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("ram");
		lst.add("peter");
		lst.add("amar");
		lst.add("birbal");
		lst.add("sam");
		
		Iterator<String> it = lst.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		/*System.out.println("using list iterator");
		ListIterator<String>  it2 = lst.listIterator();
		while(it2.hasPrevious()){
			System.out.println(it2.previous());
		}*/

	}

}
