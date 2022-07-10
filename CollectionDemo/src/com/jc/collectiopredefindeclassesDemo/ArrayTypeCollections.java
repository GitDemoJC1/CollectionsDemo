package com.jc.collectiopredefindeclassesDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayTypeCollections {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Chaitu");
		names.add("Jaya");
		names.add("Bhanu");
		names.add("BHargavi");
		names.add("Ashok");
		names.add("Konda");
		names.add("Swathi");

		// iteration
		// 3 ways enum
		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);

		}
		System.out.println("===========================================");
		for (Iterator iterator2 = names.iterator(); iterator2.hasNext();) {
			String string = (String) iterator2.next();
			System.out.println(string);
			
		}
		System.out.println("****************************************************");
		for (String name : names) {
			System.out.println(name);
		}

	}

}
