package com.jc.collectiopredefindeclassesDemo;

import java.util.Enumeration;
import java.util.Vector;

import com.jc.ourowncollectionscom.jc.owncollections.Student;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> v = new Vector();
		System.out.println("Default capacity::"+v.capacity());
		System.out.println("initial size ::"+v.size());
		v.add("chaitu-1");
		v.add("chaitu");
		v.add("virat");
		
		System.out.println("First Element::"+v.firstElement());
		System.out.println("Last Element::"+v.elementAt(v.size()-1));
		String set = v.set(2, null);
		v.removeElementAt(2);
		System.out.println();
		System.out.println("capacity::"+v.capacity());
		System.out.println("size ::"+v.size());

		Enumeration elements = v.elements();
		while (elements.hasMoreElements()) {
			String s= (String) elements.nextElement();
			System.out.println(s);
			
		}
		
	
	}
}
