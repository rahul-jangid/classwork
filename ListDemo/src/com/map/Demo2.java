package com.map;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Demo2 {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1005, "ram");
		map.put(1003, "tom");
		map.put(1007, "peter");
		map.put(1001, "raj");
		map.put(1002, "joy");
		map.put(1003, "varun");		// in map it will replace duplicates but it will ignore in treeset
		
		Set<Integer> set = map.keySet();
		for(Integer key : set){
			System.out.println(key+" "+map.get(key));
		}
		System.out.println("iterating ueses values() ");
		Collection<String> col = map.values();
		for(String str : col){
			System.out.println(str);
		}
		System.out.println("iterating using entrySet()");
		Set<java.util.Map.Entry<Integer, String>> entries = map.entrySet();
		for(java.util.Map.Entry<Integer, String> e: entries){
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
