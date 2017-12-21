package com.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("ram");
		lst.add("peter");
		lst.add("amar");
		lst.add("birbal");
		lst.add("sam");
		
		Collections.sort(lst);
		for(String str :lst){
			System.out.println(str);
			//lst.add("rahul"); 			// will throw an error because it is an advanced for loop so cannot add or remove while iterating
			
		}
		
		
		System.out.println("Descending order");
		Collections.sort(lst,Collections.reverseOrder());
		System.out.println(lst);
		
		/*for(int i=0;i<= lst.size();++i){			// will give stackoverflow exception
			System.out.println(lst.get(i));
			lst.add("gg"+i);
		}*/
		

	}

}
