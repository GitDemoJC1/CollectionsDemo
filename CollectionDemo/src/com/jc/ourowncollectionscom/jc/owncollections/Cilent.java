package com.jc.ourowncollectionscom.jc.owncollections;

public class Cilent {
	public static void main(String[] args) {
		OwnCollections coll = new OwnCollections();
		// System.out.println(coll.getSize());
		System.out.println("initial capacity before adding elements:"+coll.getCapacity());
		for (int i = 0; i < 40; i++) {

			if (i == 3 || i == 6 || i == 8) {
				coll.add("chaitu" + i);
			} else if (i == 4 || i == 7) {
				coll.add(new Student("jaya", 2000));
			} else {
				coll.add(i);
			}

		}
		System.out.println(coll.getSize());
		System.out.println("After Adding Elements:"+coll.getCapacity());
		Object obj[] = coll.getItems();
		for (int i = 0; i < obj.length; i++) {

			System.out.println(obj[i]);
		}
	}

}
