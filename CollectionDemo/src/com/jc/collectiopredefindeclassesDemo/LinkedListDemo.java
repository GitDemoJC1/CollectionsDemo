package com.jc.collectiopredefindeclassesDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> li = new LinkedList<>();
		for (int i = 0; i < 5; i++) {
			li.add("chaitu-" + i);
		}
		System.out.println(li);

		List<String> a = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			a.add("sandi-" + 1);
		}
		a.addAll(li);
		System.out.println(a);
		System.out.println(a.get(3));
		
		//set collections
		Set<String> s=new HashSet<>();
		s.addAll(a);
		System.err.println(s);
		

	}

}
