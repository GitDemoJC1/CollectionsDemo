package com.jc.collectiopredefindeclassesDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetDemo {
	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			a.add("sandi-" + 1);
		}
		//two ways
		//by creating one temp list
		 //storing list to set
		HashSet<String> hs=new HashSet<>();
		hs.add("Monday");//1361640818
		hs.add("Tuesday"); //3261341
		hs.add("Wednesday"); //106433006   key wednesday  PRESENT
		hs.add("Thursday");	//3016262
		hs.add("friday");
		hs.add("saturday");
		hs.add("saturday");
		hs.addAll(a);
		System.err.println(hs);
		for (String val : hs) {
			System.err.println(val);
			
		}
		
		
		
	}

}
