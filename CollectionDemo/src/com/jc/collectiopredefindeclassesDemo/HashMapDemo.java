package com.jc.collectiopredefindeclassesDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		HashMap<String, String> hm=new HashMap<>();
		       //key      value
		hm.put("first", "name");
		hm.put("third", null);
		
		for (Map.Entry<String, String> entry : hm.entrySet()) {
			String key = entry.getKey();
			if (hm.containsKey("first")) {
				System.out.println(hm.get(key));
			}
			
		}
		
	}

}
