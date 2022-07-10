package com.jc.collectiopredefindeclassesDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		for (int i = 5; i > 0; i--) {
			a.add(""+i*2);
		}
		System.out.println("LIST::"+a);
		//By using this ZERO PARAMA CONSTRUCTOR CREATES A EMPTY TREESET THAT WILL BE SORTED INS ASCENDING ORDER .
		SortedSet<String> s=new TreeSet<>(a);
		//we can another collections while creating an object
		Set<String> s1=new TreeSet<>(a);
		
		System.out.println(s1);
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.subSet("sandi-1", "sandi-3"));
		System.out.println(s.tailSet("sandi-4"));
		System.out.println(s.headSet("sandi-4"));
		
		
		
		//sandi-1,sandi-2
		
	}
}
