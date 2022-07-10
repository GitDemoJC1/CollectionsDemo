package com.jc.collectiopredefindeclassesDemo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsModifications {
	public static void main(String[] args) {
		List<String> names = new LinkedList();
		names.add("Chaitu");
		names.add("Jaya");
		names.add("Bhanu");
		names.add("BHargavi");
		names.add("Chaitu");
		names.add("Ashok");
		names.add("Konda");
		names.add("Jaya");
		names.add("Swathi");
		names.add("BHargavi");
		for (String name : names) {
			System.out.println(name);
		}

		System.out.println();
		int cnt = 0;
		for (String name : names) {
			if (name.endsWith("a")) {
				int ch='a';
				names.set(cnt, name.replace(name,""+ch ));
			}
			cnt++;
		}
		
		System.out.println();
		for (String name : names) {
			System.out.println(name);
		}


	}
}
